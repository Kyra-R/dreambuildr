package com.xxavierr404.dreambuildr.controllers;

import com.xxavierr404.dreambuildr.model.*;
import com.xxavierr404.dreambuildr.services.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Класс - контроллер каталога
 */
@RestController
@RequestMapping("/catalogue")
@CrossOrigin
public class CatalogueController {
    /**
     * Поле - каталог служб
     */
    private final CatalogueService catalogueService;

    /**
     * Конструктор - создание нового объекта
     * @param catalogueService - Каталог служб
     */
    @Autowired
    public CatalogueController(CatalogueService catalogueService) {
        this.catalogueService = catalogueService;
    }

    /**
     * Обработчик GET-запроса для материнских плат
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Список материнских плат
     */
    @GetMapping("/motherboards/getBunch")
    public List<Motherboard> getMotherboards(@RequestParam("start") Long start,
                                             @RequestParam("end") Long end) {
        return catalogueService.getMotherboardsByIdBetween(start, end);
    }

    @GetMapping("/motherboards/getAll")
    public List<Motherboard> getAllMotherboards() {
        return catalogueService.getAllMotherboards();
    }

    @GetMapping("/motherboards/getOne")
    public Motherboard getMotherboard(@RequestParam("id") Long id) {
        return catalogueService.getMotherboard(id);
    }

    /**
     * Обработчик POST-запроса для материнских плат
     * @param board - Материнская плата
     * @return Сущность-ответ
     */
    @PostMapping("/motherboards")
    public ResponseEntity<String> addMotherboard(Motherboard board) {
        catalogueService.addNewMotherboard(board);
        return ResponseEntity.ok("Success");
    }

    /**
     * Обработчик GET-запроса для процессоров
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Список процессоров
     */
    @GetMapping("/cpus/getBunch")
    public List<CPU> getCPUs(@RequestParam("start") Long start,
                             @RequestParam("end") Long end) {
        return catalogueService.getCPUsByIdBetween(start, end);
    }

    @GetMapping("/cpus/getAll")
    public List<CPU> getAllCpus() {
        return catalogueService.getAllCPUs();
    }

    @GetMapping("/cpus/getOne")
    public CPU getCPU(@RequestParam("id") Long id) {
        return catalogueService.getCPU(id);
    }

    /**
     * Обработчик POST-запроса для процессоров
     * @param cpu - Процессор
     * @return Сущность-ответ
     */
    @PostMapping("/cpus")
    public ResponseEntity<String> addCPU(CPU cpu) {
        catalogueService.addNewCPU(cpu);
        return ResponseEntity.ok("Success");
    }

    /**
     * Обработчик GET-запроса для оперативной памяти
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Список модулей оперативной памяти
     */
    @GetMapping("/rams/getBunch")
    public List<RAM> getRAMs(@RequestParam("start") Long start,
                             @RequestParam("end") Long end) {
        return catalogueService.getRAMsByIdBetween(start, end);
    }

    @GetMapping("/rams/getAll")
    public List<RAM> getAllRAMs() {
        return catalogueService.getAllRAMs();
    }

    @GetMapping("/rams/getOne")
    public RAM getRAM(@RequestParam("id") Long id) {
        return catalogueService.getRam(id);
    }

    /**
     * Обработчик POST-запроса для оперативной памяти
     * @param ram - Оперативная память
     * @return Сущность-ответ
     */
    @PostMapping("/rams")
    public ResponseEntity<String> addRAM(RAM ram) {
        catalogueService.addNewRAM(ram);
        return ResponseEntity.ok("Success");
    }

    /**
     * Обработчик GET-запроса для запоминающих устройств
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Список запоминающих устройств
     */
    @GetMapping("/drives/getBunch")
    public List<Drive> getDrives(@RequestParam("start") Long start,
                                 @RequestParam("end") Long end) {
        return catalogueService.getDrivesByIdBetween(start, end);
    }

    @GetMapping("/drives/getAll")
    public List<Drive> getAllDrives() {
        return catalogueService.getAllDrives();
    }

    @GetMapping("/drives/getOne")
    public Drive getDrive(@RequestParam("id") Long id) {
        return catalogueService.getDrive(id);
    }

    /**
     * Обработчик POST-запроса для запоминающих устройств
     * @param drive - Запоминающее устройство
     * @return Сущность-ответ
     */
    @PostMapping("/drives")
    public ResponseEntity<String> addDrive(Drive drive) {
        catalogueService.addNewDrive(drive);
        return ResponseEntity.ok("Success");
    }

    /**
     * Обработчик GET-запроса для блоков питания
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Список блоков питания
     */
    @GetMapping("/powerunits/getBunch")
    public List<PowerUnit> getPowerUnits(@RequestParam("start") Long start,
                                   @RequestParam("end") Long end) {
        return catalogueService.getPowerUnitsByIdBetween(start, end);
    }

    @GetMapping("/powerunits/getAll")
    public List<PowerUnit> getAllPowerunits() {
        return catalogueService.getAllPowerUnits();
    }

    @GetMapping("/powerunits/getOne")
    public PowerUnit getPowerUnit(@RequestParam("id") Long id) {
        return catalogueService.getPowerUnit(id);
    }

    /**
     * Обработчик POST-запроса для блоков питания
     * @param powerUnit - Блок питания
     * @return Сущность-ответ
     */
    @PostMapping("/powerunits")
    public ResponseEntity<String> addPowerUnit(PowerUnit powerUnit) {
        catalogueService.addNewPowerUnit(powerUnit);
        return ResponseEntity.ok("Success");
    }

    /**
     * Обработчик GET-запроса для видеокарт
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Список видеокарт
     */
    @GetMapping("/videocards/getBunch")
    public List<Videocard> getVideocards(@RequestParam("start") Long start,
                             @RequestParam("end") Long end) {
        return catalogueService.getVideocardsByIdBetween(start, end);
    }

    @GetMapping("/videocards/getAll")
    public List<Videocard> getAllVideocards() {
        return catalogueService.getAllVideocards();
    }

    @GetMapping("/videocards/getOne")
    public Videocard getVideocard(@RequestParam("id") Long id) {
        return catalogueService.getVideocard(id);
    }

    /**
     * Обработчик POST-запроса для видеокарт
     * @param videocard - Видеокарта
     * @return Сущность-ответ
     */
    @PostMapping("/videocards")
    public ResponseEntity<String> addVideocard(Videocard videocard) {
        catalogueService.addNewVideocard(videocard);
        return ResponseEntity.ok("Success");
    }

    /**
     * Обработчик GET-запроса для всего каталога
     * @param start - Левая граница
     * @param end - Правая граница
     * @return Списов товаров
     */
    @GetMapping("/")
    public List<Item> getCatalogue(Long start, Long end) {
        return catalogueService.getAllItems(start, end);
    }
}
