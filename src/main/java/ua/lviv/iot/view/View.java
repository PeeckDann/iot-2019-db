package ua.lviv.iot.view;

import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import ua.lviv.iot.view.Printable;
import ua.lviv.iot.controller.impl.DesktopController;
import ua.lviv.iot.controller.impl.HardwareController;
import ua.lviv.iot.controller.impl.IpPhoneController;
import ua.lviv.iot.controller.impl.LaptopController;
import ua.lviv.iot.controller.impl.LocationController;
import ua.lviv.iot.controller.impl.MonitorController;
import ua.lviv.iot.controller.impl.OfficeController;
import ua.lviv.iot.controller.impl.PrinterController;
import ua.lviv.iot.controller.impl.RouterController;
import ua.lviv.iot.controller.impl.WorkerController;
import ua.lviv.iot.controller.impl.WorkerHasOfficeController;
import ua.lviv.iot.controller.impl.WorkerHasWorkspaceController;
import ua.lviv.iot.controller.impl.WorkspaceController;
import ua.lviv.iot.model.entity.Desktop;
import ua.lviv.iot.model.entity.Hardware;
import ua.lviv.iot.model.entity.IpPhone;
import ua.lviv.iot.model.entity.Laptop;
import ua.lviv.iot.model.entity.Location;
import ua.lviv.iot.model.entity.Monitor;
import ua.lviv.iot.model.entity.Office;
import ua.lviv.iot.model.entity.Printer;
import ua.lviv.iot.model.entity.Router;
import ua.lviv.iot.model.entity.Worker;
import ua.lviv.iot.model.entity.WorkerHasOffice;
import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import ua.lviv.iot.model.entity.Workspace;

public class View {

    private static final Scanner SCANNER = new Scanner(System.in, StandardCharsets.UTF_8);

    private final DesktopController desktopController = new DesktopController();
    private final HardwareController hardwareController = new HardwareController();
    private final IpPhoneController ipPhoneController = new IpPhoneController();
    private final LaptopController laptopController = new LaptopController();
    private final LocationController locationController = new LocationController();
    private final MonitorController monitorController = new MonitorController();
    private final OfficeController officeController = new OfficeController();
    private final PrinterController printerController = new PrinterController();
    private final RouterController routerController = new RouterController();
    private final WorkerController workerController = new WorkerController();
    private final WorkspaceController workspaceController = new WorkspaceController();
    private final WorkerHasOfficeController workerHasOfficeController = new WorkerHasOfficeController();
    private final WorkerHasWorkspaceController workerHasWorkspaceController = new WorkerHasWorkspaceController();

    private final Map<String, Printable> menu = new LinkedHashMap<>();

    public View() {
        menu.put("11", this::getAllDesktops);
        menu.put("12", this::getDesktopById);
        menu.put("13", this::createDesktop);
        menu.put("14", this::updateDesktop);
        menu.put("15", this::deleteDesktop);

        menu.put("21", this::getAllHardware);
        menu.put("22", this::getHardwareById);
        menu.put("23", this::createHardware);
        menu.put("24", this::updateHardware);
        menu.put("25", this::deleteHardware);

        menu.put("31", this::getAllIpPhones);
        menu.put("32", this::getIpPhoneById);
        menu.put("33", this::createIpPhone);
        menu.put("34", this::updateIpPhone);
        menu.put("35", this::deleteIpPhone);

        menu.put("41", this::getAllLaptops);
        menu.put("42", this::getLaptopById);
        menu.put("43", this::createLaptop);
        menu.put("44", this::updateLaptop);
        menu.put("45", this::deleteLaptop);

        menu.put("51", this::getAllLocations);
        menu.put("52", this::getLocationById);
        menu.put("53", this::createLocation);
        menu.put("54", this::updateLocation);
        menu.put("55", this::deleteLocation);

        menu.put("61", this::getAllMonitors);
        menu.put("62", this::getMonitorById);
        menu.put("63", this::createMonitor);
        menu.put("64", this::updateMonitor);
        menu.put("65", this::deleteMonitor);

        menu.put("71", this::getAllOffices);
        menu.put("72", this::getOfficeById);
        menu.put("73", this::createOffice);
        menu.put("74", this::updateOffice);
        menu.put("75", this::deleteOffice);

        menu.put("81", this::getAllPrinters);
        menu.put("82", this::getPrinterById);
        menu.put("83", this::createPrinter);
        menu.put("84", this::updatePrinter);
        menu.put("85", this::deletePrinter);

        menu.put("91", this::getAllRouters);
        menu.put("92", this::getRouterById);
        menu.put("93", this::createRouter);
        menu.put("94", this::updateRouter);
        menu.put("95", this::deleteRouter);

        menu.put("101", this::getAllWorkers);
        menu.put("102", this::getWorkerById);
        menu.put("103", this::createWorker);
        menu.put("104", this::updateWorker);
        menu.put("105", this::deleteWorker);

        menu.put("111", this::getAllWorkspaces);
        menu.put("112", this::getWorkspaceById);
        menu.put("113", this::createWorkspace);
        menu.put("114", this::updateWorkspace);
        menu.put("115", this::deleteWorkspace);

        menu.put("121", this::getAllWorkerHasOffices);
        menu.put("122", this::getWorkerHasOfficeById);
        menu.put("123", this::createWorkerHasOffice);
        menu.put("124", this::updateWorkerHasOffice);
        menu.put("125", this::deleteWorkerHasOffice);

        menu.put("131", this::getAllWorkerHasWorkspaces);
        menu.put("132", this::getWorkerHasWorkspaceById);
        menu.put("133", this::createWorkerHasWorkspace);
        menu.put("134", this::updateWorkerHasWorkspace);
        menu.put("135", this::deleteWorkerHasWorkspace);
    }

    public void displayMenu() {
        System.out.println("=======================================================================");
        System.out.println("|                Enter two numbers to choose the option               |");
        System.out.println("=======================================================================");
        System.out.println("| First number - entity:           |  Second number - operation:      |");
        System.out.println("|   1 - desktop                    |    1 - GET ALL                   |");
        System.out.println("|   2 - hardware                   |    2 - GET ONE                   |");
        System.out.println("|   3 - ip phone                   |    3 - CREATE                    |");
        System.out.println("|   4 - laptop                     |    4 - UPDATE                    |");
        System.out.println("|   5 - location                   |    5 - DELETE                    |");
        System.out.println("|   6 - monitor                    |                                  |");
        System.out.println("|   7 - office                     |                                  |");
        System.out.println("|   8 - printer                    |                                  |");
        System.out.println("|   9 - router                     |                                  |");
        System.out.println("|   10 - worker                    |                                  |");
        System.out.println("|   11 - workspace                 |                                  |");
        System.out.println("|   12 - worker has office         |                                  |");
        System.out.println("|   13 - worker has workspace      |                                  |");
        System.out.println("=======================================================================");
    }

    public final void show() {
        String input;
        displayMenu();
        System.out.println("\nEnter parameter:\n");
        do {
            try {
                input = SCANNER.next();
                menu.get(input).print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (SCANNER.hasNext());
    }

    // Desktop
    private Desktop getDesktopInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter hardware id: ");
        Integer hardware_id = SCANNER.nextInt();
        Hardware hardware = hardwareController.getBy(hardware_id);
        System.out.println("\nEnter workspace id: ");
        Integer workspace_id = SCANNER.nextInt();
        Workspace workspace = workspaceController.getBy(workspace_id);

        return new Desktop(name, hardware, workspace);
    }

    private void getAllDesktops() throws SQLException {
        System.out.println("\n[Desktop | GET]");
        System.out.println(desktopController.getAll() + "\n");
    }

    private void getDesktopById() throws SQLException {
        System.out.println("\n[Desktop | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(desktopController.getBy(id) + "\n");
    }

    private void createDesktop() throws SQLException {
        System.out.println("\n[Desktop | CREATE]");
        Desktop desktop = getDesktopInputs();
        desktopController.create(desktop);
        System.out.println("Desktop created.\n");
    }

    private void updateDesktop() throws SQLException {
        System.out.println("\n[Desktop | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Desktop desktop = getDesktopInputs();
        desktop.setId(id);

        desktopController.update(desktop);
        System.out.println("Desktop with ID=" + id + " successfully updated\n");
    }

    private void deleteDesktop() throws SQLException {
        System.out.println("\n[Desktop | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        desktopController.delete(id);
        System.out.println("Desktop with ID=" + id + " successfully deleted\n");
    }

    // Hardware
    private Hardware getHardwareInputs() {
        System.out.println("\nEnter processor: ");
        String processor = SCANNER.next();
        System.out.println("\nEnter motherboard: ");
        String motherboard = SCANNER.next();
        System.out.println("\nEnter RAM: ");
        String RAM = SCANNER.next();
        System.out.println("\nEnter hard drive: ");
        String hard_drive = SCANNER.next();
        System.out.println("\nEnter video card: ");
        String video_card = SCANNER.next();
        System.out.println("\nEnter power supply: ");
        String power_supply = SCANNER.next();

        return new Hardware(processor, motherboard, RAM, hard_drive, video_card, power_supply);
    }

    private void getAllHardware() throws SQLException {
        System.out.println("\n[Hardware | GET]");
        System.out.println(hardwareController.getAll() + "\n");
    }

    private void getHardwareById() throws SQLException {
        System.out.println("\n[Hardware | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(hardwareController.getBy(id) + "\n");
    }

    private void createHardware() throws SQLException {
        System.out.println("\n[Hardware | CREATE]");
        Hardware hardware = getHardwareInputs();
        hardwareController.create(hardware);
        System.out.println("Hardware created.\n");
    }

    private void updateHardware() throws SQLException {
        System.out.println("\n[Hardware | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Hardware hardware = getHardwareInputs();
        hardware.setId(id);

        hardwareController.update(hardware);
        System.out.println("Hardware with ID=" + id + " successfully updated\n");
    }

    private void deleteHardware() throws SQLException {
        System.out.println("\n[Hardware | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        hardwareController.delete(id);
        System.out.println("Hardware with ID=" + id + " successfully deleted\n");
    }

    // IpPhone
    private IpPhone getIpPhoneInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter number: ");
        String number = SCANNER.next();
        System.out.println("\nEnter workspace id: ");
        Integer workspace_id = SCANNER.nextInt();
        Workspace workspace = workspaceController.getBy(workspace_id);

        return new IpPhone(name, number, workspace);
    }

    private void getAllIpPhones() throws SQLException {
        System.out.println("\n[IpPhone | GET]");
        System.out.println(ipPhoneController.getAll() + "\n");
    }

    private void getIpPhoneById() throws SQLException {
        System.out.println("\n[IpPhone | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(ipPhoneController.getBy(id) + "\n");
    }

    private void createIpPhone() throws SQLException {
        System.out.println("\n[IpPhone | CREATE]");
        IpPhone ipPhone = getIpPhoneInputs();
        ipPhoneController.create(ipPhone);
        System.out.println("IpPhone created.\n");
    }

    private void updateIpPhone() throws SQLException {
        System.out.println("\n[IpPhone | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        IpPhone ipPhone = getIpPhoneInputs();
        ipPhone.setId(id);

        ipPhoneController.update(ipPhone);
        System.out.println("IpPhone with ID=" + id + " successfully updated\n");
    }

    private void deleteIpPhone() throws SQLException {
        System.out.println("\n[IpPhone | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        ipPhoneController.delete(id);
        System.out.println("IpPhone with ID=" + id + " successfully deleted\n");
    }

    // Laptop
    private Laptop getLaptopInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter hardware id: ");
        Integer hardware_id = SCANNER.nextInt();
        Hardware hardware = hardwareController.getBy(hardware_id);
        System.out.println("\nEnter worker id: ");
        Integer worker_id = SCANNER.nextInt();
        Worker worker = workerController.getBy(worker_id);

        return new Laptop(name, hardware, worker);
    }

    private void getAllLaptops() throws SQLException {
        System.out.println("\n[Laptop | GET]");
        System.out.println(laptopController.getAll() + "\n");
    }

    private void getLaptopById() throws SQLException {
        System.out.println("\n[Laptop | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(laptopController.getBy(id) + "\n");
    }

    private void createLaptop() throws SQLException {
        System.out.println("\n[Laptop | CREATE]");
        Laptop laptop = getLaptopInputs();
        laptopController.create(laptop);
        System.out.println("Laptop created.\n");
    }

    private void updateLaptop() throws SQLException {
        System.out.println("\n[Laptop | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Laptop laptop = getLaptopInputs();
        laptop.setId(id);

        laptopController.update(laptop);
        System.out.println("Laptop with ID=" + id + " successfully updated\n");
    }

    private void deleteLaptop() throws SQLException {
        System.out.println("\n[Laptop | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        laptopController.delete(id);
        System.out.println("Laptop with ID=" + id + " successfully deleted\n");
    }

    // Location
    private Location getLocationInputs() {
        System.out.println("\nEnter building number: ");
        Integer building_number = SCANNER.nextInt();
        System.out.println("\nEnter street: ");
        String street = SCANNER.next();
        System.out.println("\nEnter city: ");
        String city = SCANNER.next();
        System.out.println("\nEnter country: ");
        String country = SCANNER.next();

        return new Location(building_number, street, city, country);
    }

    private void getAllLocations() throws SQLException {
        System.out.println("\n[Location | GET]");
        System.out.println(locationController.getAll() + "\n");
    }

    private void getLocationById() throws SQLException {
        System.out.println("\n[Location | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(locationController.getBy(id) + "\n");
    }

    private void createLocation() throws SQLException {
        System.out.println("\n[Location | CREATE]");
        Location location = getLocationInputs();
        locationController.create(location);
        System.out.println("Location created.\n");
    }

    private void updateLocation() throws SQLException {
        System.out.println("\n[Location | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Location location = getLocationInputs();
        location.setId(id);

        locationController.update(location);
        System.out.println("Location with ID=" + id + " successfully updated\n");
    }

    private void deleteLocation() throws SQLException {
        System.out.println("\n[Location | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        locationController.delete(id);
        System.out.println("Location with ID=" + id + " successfully deleted\n");
    }

    // Monitor
    private Monitor getMonitorInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter size: ");
        String size = SCANNER.next();
        System.out.println("\nEnter resolution: ");
        String resolution = SCANNER.next();
        System.out.println("\nEnter refresh rate: ");
        String refresh_rate = SCANNER.next();
        System.out.println("\nEnter workspace id: ");
        Integer workspace_id = SCANNER.nextInt();
        Workspace workspace = workspaceController.getBy(workspace_id);

        return new Monitor(name, size, resolution, refresh_rate, workspace);
    }

    private void getAllMonitors() throws SQLException {
        System.out.println("\n[Monitor | GET]");
        System.out.println(monitorController.getAll() + "\n");
    }

    private void getMonitorById() throws SQLException {
        System.out.println("\n[Monitor | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(monitorController.getBy(id) + "\n");
    }

    private void createMonitor() throws SQLException {
        System.out.println("\n[Monitor | CREATE]");
        Monitor monitor = getMonitorInputs();
        monitorController.create(monitor);
        System.out.println("Monitor created.\n");
    }

    private void updateMonitor() throws SQLException {
        System.out.println("\n[Monitor | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Monitor monitor = getMonitorInputs();
        monitor.setId(id);

        monitorController.update(monitor);
        System.out.println("Monitor with ID=" + id + " successfully updated\n");
    }

    private void deleteMonitor() throws SQLException {
        System.out.println("\n[Monitor | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        monitorController.delete(id);
        System.out.println("Monitor with ID=" + id + " successfully deleted\n");
    }

    // Office
    private Office getOfficeInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter location id: ");
        Integer location_id = SCANNER.nextInt();
        Location location = locationController.getBy(location_id);

        return new Office(name, location);
    }

    private void getAllOffices() throws SQLException {
        System.out.println("\n[Office | GET]");
        System.out.println(officeController.getAll() + "\n");
    }

    private void getOfficeById() throws SQLException {
        System.out.println("\n[Office | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(officeController.getBy(id) + "\n");
    }

    private void createOffice() throws SQLException {
        System.out.println("\n[Office | CREATE]");
        Office office = getOfficeInputs();
        officeController.create(office);
        System.out.println("Office created.\n");
    }

    private void updateOffice() throws SQLException {
        System.out.println("\n[Office | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Office office = getOfficeInputs();
        office.setId(id);

        officeController.update(office);
        System.out.println("Office with ID=" + id + " successfully updated\n");
    }

    private void deleteOffice() throws SQLException {
        System.out.println("\n[Office | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        officeController.delete(id);
        System.out.println("Office with ID=" + id + " successfully deleted\n");
    }

    // Printer
    private Printer getPrinterInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter format: ");
        String format = SCANNER.next();
        System.out.println("\nEnter design: ");
        String design = SCANNER.next();
        System.out.println("\nEnter workspace id: ");
        Integer workspace_id = SCANNER.nextInt();
        Workspace workspace = workspaceController.getBy(workspace_id);

        return new Printer(name, format, design, workspace);
    }

    private void getAllPrinters() throws SQLException {
        System.out.println("\n[Printer | GET]");
        System.out.println(printerController.getAll() + "\n");
    }

    private void getPrinterById() throws SQLException {
        System.out.println("\n[Printer | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(printerController.getBy(id) + "\n");
    }

    private void createPrinter() throws SQLException {
        System.out.println("\n[Printer | CREATE]");
        Printer printer = getPrinterInputs();
        printerController.create(printer);
        System.out.println("Printer created.\n");
    }

    private void updatePrinter() throws SQLException {
        System.out.println("\n[Printer | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Printer printer = getPrinterInputs();
        printer.setId(id);

        printerController.update(printer);
        System.out.println("Printer with ID=" + id + " successfully updated\n");
    }

    private void deletePrinter() throws SQLException {
        System.out.println("\n[Printer | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        printerController.delete(id);
        System.out.println("Printer with ID=" + id + " successfully deleted\n");
    }

    // Router
    private Router getRouterInputs() throws SQLException {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter frequency range: ");
        String frequency_range = SCANNER.next();
        System.out.println("\nEnter WAN: ");
        String WAN = SCANNER.next();
        System.out.println("\nEnter office id: ");
        Integer office_id = SCANNER.nextInt();
        Office office = officeController.getBy(office_id);

        return new Router(name, frequency_range, WAN, office);
    }

    private void getAllRouters() throws SQLException {
        System.out.println("\n[Router | GET]");
        System.out.println(routerController.getAll() + "\n");
    }

    private void getRouterById() throws SQLException {
        System.out.println("\n[Router | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(routerController.getBy(id) + "\n");
    }

    private void createRouter() throws SQLException {
        System.out.println("\n[Router | CREATE]");
        Router router = getRouterInputs();
        routerController.create(router);
        System.out.println("Router created.\n");
    }

    private void updateRouter() throws SQLException {
        System.out.println("\n[Router | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Router router = getRouterInputs();
        router.setId(id);

        routerController.update(router);
        System.out.println("Router with ID=" + id + " successfully updated\n");
    }

    private void deleteRouter() throws SQLException {
        System.out.println("\n[Router | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        routerController.delete(id);
        System.out.println("Router with ID=" + id + " successfully deleted\n");
    }

    // Worker
    private Worker getWorkerInputs() {
        System.out.println("\nEnter name: ");
        String name = SCANNER.next();
        System.out.println("\nEnter surname: ");
        String surname = SCANNER.next();
        System.out.println("\nEnter position: ");
        String position = SCANNER.next();

        return new Worker(name, surname, position);
    }

    private void getAllWorkers() throws SQLException {
        System.out.println("\n[Worker | GET]");
        System.out.println(workerController.getAll() + "\n");
    }

    private void getWorkerById() throws SQLException {
        System.out.println("\n[Worker | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(workerController.getBy(id) + "\n");
    }

    private void createWorker() throws SQLException {
        System.out.println("\n[Worker | CREATE]");
        Worker worker = getWorkerInputs();
        workerController.create(worker);
        System.out.println("Worker created.\n");
    }

    private void updateWorker() throws SQLException {
        System.out.println("\n[Worker | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Worker worker = getWorkerInputs();
        worker.setId(id);

        workerController.update(worker);
        System.out.println("Worker with ID=" + id + " successfully updated\n");
    }

    private void deleteWorker() throws SQLException {
        System.out.println("\n[Worker | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        workerController.delete(id);
        System.out.println("Worker with ID=" + id + " successfully deleted\n");
    }

    // Workspace
    private Workspace getWorkspaceInputs() throws SQLException {
        System.out.println("\nEnter cabinet number: ");
        Integer cabinet_number = SCANNER.nextInt();
        System.out.println("\nEnter office id: ");
        Integer office_id = SCANNER.nextInt();
        Office office = officeController.getBy(office_id);

        return new Workspace(cabinet_number, office);
    }

    private void getAllWorkspaces() throws SQLException {
        System.out.println("\n[Workspace | GET]");
        System.out.println(workspaceController.getAll() + "\n");
    }

    private void getWorkspaceById() throws SQLException {
        System.out.println("\n[Workspace | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(workspaceController.getBy(id) + "\n");
    }

    private void createWorkspace() throws SQLException {
        System.out.println("\n[Workspace | CREATE]");
        Workspace workspace = getWorkspaceInputs();
        workspaceController.create(workspace);
        System.out.println("Workspace created.\n");
    }

    private void updateWorkspace() throws SQLException {
        System.out.println("\n[Workspace | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        Workspace workspace = getWorkspaceInputs();
        workspace.setId(id);

        workspaceController.update(workspace);
        System.out.println("Workspace with ID=" + id + " successfully updated\n");
    }

    private void deleteWorkspace() throws SQLException {
        System.out.println("\n[Workspace | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        workspaceController.delete(id);
        System.out.println("Workspace with ID=" + id + " successfully deleted\n");
    }

    // WorkerHasOffice
    private WorkerHasOffice getWorkerHasOfficeInputs() throws SQLException {
        System.out.println("\nEnter worker id: ");
        Integer worker_id = SCANNER.nextInt();
        Worker worker = workerController.getBy(worker_id);
        System.out.println("\nEnter office id: ");
        Integer office_id = SCANNER.nextInt();
        Office office = officeController.getBy(office_id);

        return new WorkerHasOffice(worker, office);
    }

    private void getAllWorkerHasOffices() throws SQLException {
        System.out.println("\n[WorkerHasOffice | GET]");
        System.out.println(workerHasOfficeController.getAll() + "\n");
    }

    private void getWorkerHasOfficeById() throws SQLException {
        System.out.println("\n[WorkerHasOffice | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(workerHasOfficeController.getBy(id) + "\n");
    }

    private void createWorkerHasOffice() throws SQLException {
        System.out.println("\n[WorkerHasOffice | CREATE]");
        WorkerHasOffice workerHasOffice = getWorkerHasOfficeInputs();
        workerHasOfficeController.create(workerHasOffice);
        System.out.println("WorkerHasOffice created.\n");
    }

    private void updateWorkerHasOffice() throws SQLException {
        System.out.println("\n[WorkerHasOffice | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        WorkerHasOffice workerHasOffice = getWorkerHasOfficeInputs();
        workerHasOffice.setId(id);

        workerHasOfficeController.update(workerHasOffice);
        System.out.println("WorkerHasOffice with ID=" + id + " successfully updated\n");
    }

    private void deleteWorkerHasOffice() throws SQLException {
        System.out.println("\n[WorkerHasOffice | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        workerHasOfficeController.delete(id);
        System.out.println("WorkerHasOffice with ID=" + id + " successfully deleted\n");
    }

    // WorkerHasWorkspace
    private WorkerHasWorkspace getWorkerHasWorkspaceInputs() throws SQLException {
        System.out.println("\nEnter worker id: ");
        Integer worker_id = SCANNER.nextInt();
        Worker worker = workerController.getBy(worker_id);
        System.out.println("\nEnter workspace id: ");
        Integer workspace_id = SCANNER.nextInt();
        Workspace workspace = workspaceController.getBy(workspace_id);

        return new WorkerHasWorkspace(worker, workspace);
    }

    private void getAllWorkerHasWorkspaces() throws SQLException {
        System.out.println("\n[WorkerHasWorkspace | GET]");
        System.out.println(workerHasWorkspaceController.getAll() + "\n");
    }

    private void getWorkerHasWorkspaceById() throws SQLException {
        System.out.println("\n[WorkerHasWorkspace | GET] Enter ID: ");
        Integer id = SCANNER.nextInt();
        System.out.println(workerHasWorkspaceController.getBy(id) + "\n");
    }

    private void createWorkerHasWorkspace() throws SQLException {
        System.out.println("\n[WorkerHasWorkspace | CREATE]");
        WorkerHasWorkspace workerHasWorkspace = getWorkerHasWorkspaceInputs();
        workerHasWorkspaceController.create(workerHasWorkspace);
        System.out.println("WorkerHasWorkspace created.\n");
    }

    private void updateWorkerHasWorkspace() throws SQLException {
        System.out.println("\n[WorkerHasWorkspace | UPDATE] Enter ID: ");
        Integer id = SCANNER.nextInt();
        WorkerHasWorkspace workerHasWorkspace = getWorkerHasWorkspaceInputs();
        workerHasWorkspace.setId(id);

        workerHasWorkspaceController.update(workerHasWorkspace);
        System.out.println("WorkerHasWorkspace with ID=" + id + " successfully updated\n");
    }

    private void deleteWorkerHasWorkspace() throws SQLException {
        System.out.println("\n[WorkerHasWorkspace | DELETE] Enter ID: ");
        int id = SCANNER.nextInt();

        workerHasWorkspaceController.delete(id);
        System.out.println("WorkerHasWorkspace with ID=" + id + " successfully deleted\n");
    }

}