package tadjik.ilyosjon;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {
    public SendMessage sendMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu aleykum!!! \n\n CarParkingSmartSolution Telegramm Botiga \n\n\n\n XUSH KELIBSIZ!!! ");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("O`zbek tili");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Rus tili");
        row.add(button1);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang!!!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();

        button.setText("Map");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Station");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Carservice");
        row.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage region(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang!!!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();

        button.setText("Sergeli");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage station(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang!!!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();

        button.setText("Gasoline");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("ElectroCarCharger");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("BusStation");
        row.add(button2);
        rowList.add(row);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("◀\uFE0F Orqaga");
        row.add(button3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //gasoline Sergeli
    public SendLocation gasoline1(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2380118);
        sendLocation.setLongitude(69.1383039);
        return sendLocation;
    }
    public SendMessage gasoline1Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Metan zapravka Mustang" +
                " Telefon raqami:  +99898123456789" +
                " Ish vaqti : 24/7");
        return sendMessage;
    }
    public SendLocation gasoline2(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.230036);
        sendLocation.setLongitude(69.2171957);
        return sendLocation;
    }
    public SendMessage gasoline2Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Duran Petroleum Petrol Station" +
                " Telefon raqami:  +99898123456789"  +
                " Ish vaqti : 24/7");
        return sendMessage;
    }
    public SendLocation gasoline3(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2445964);
        sendLocation.setLongitude(69.229962);
        return sendLocation;
    }
    public SendMessage gasoline3Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Sergeli Propan Station\" +\n" +
                "  Telefon raqami:  +99898123456789" +
                "  Ish vaqti : 24/7");
        return sendMessage;
    }

    //electroCarCharger Sergeli
    public SendMessage charger1Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Yangi Sergeli Road 22, 100085, Tashkent, Tashkent Region, Uzbekistan" +
                " Telefon raqami:  +99898123456789" +
                " Ish vaqti : 24/7");
        return sendMessage;
    }
    public SendLocation charger1(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2373356);
        sendLocation.setLongitude(69.0617695);
        return sendLocation;
    }
    public SendMessage charger2Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Kumaryk Street 6, Tashkent, Uzbekistan" +
                " Telefon raqami:  +99898123456789" +
                " Ish vaqti : 24/7");
        return sendMessage;
    }
    public SendLocation charger2(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2373356);
        sendLocation.setLongitude(69.0617695);
        return sendLocation;
    }
    public SendMessage charger3Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" K Watt Charging Station" +
                " Telefon raqami:  +99898123456789" +
                " Ish vaqti : 24/7");
        return sendMessage;
    }
    public SendLocation charger3(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2373356);
        sendLocation.setLongitude(69.0617695);
        return sendLocation;
    }
    public SendMessage charger4Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Electric Vehicle Charging Station" +
                " Telefon raqami:  +99898123456789" +
                " Ish vaqti : 24/7");
        return sendMessage;
    }
    public SendLocation charger4(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.2373356);
        sendLocation.setLongitude(69.0617695);
        return sendLocation;
    }

    //BusStation
    public SendMessage busStation1Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sergeli district, Block 1\n" +
                "Sergeli mavzesi, 1-daha\n" +
                "Bus stop");
        return sendMessage;
    }
    public SendLocation busStation1(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.204008);
        sendLocation.setLongitude(69.2045273);
        return sendLocation;
    }
    public SendMessage busStation2Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sergeli district, Block 2\n" +
                "Sergeli mavzesi, 2-daha\n" +
                "Bus stop");
        return sendMessage;
    }
    public SendLocation busStation2(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.204008);
        sendLocation.setLongitude(69.1978326);
        return sendLocation;
    }
    public SendMessage busStation3Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Sergeli district, Block 3\n" +
                "Sergeli mavzesi, 3-daha\n" +
                "Bus stop");
        return sendMessage;
    }
    public SendLocation busStation3(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.204008);
        sendLocation.setLongitude(69.1978326);
        return sendLocation;
    }
    public SendMessage busStation4Text(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sergeli Market\n" +
                "Sergeli bozori\n" +
                "Bus stop");
        return sendMessage;
    }
    public SendLocation busStation4(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.22807);
        sendLocation.setLongitude(69.1997136);
        return sendLocation;
    }

    //MAP && CARSERVICE
    public SendMessage start(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu Aleykum");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Map");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("CarWash");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("RepairEngineShop");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("CarDetailsShops");
        row4.add(button4);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("TowingService");
        row5.add(button5);
        rowList.add(row5);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage region1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tumanni tanlang :");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Sergeli tumani");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage parkingname(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Parkovka nomini tanlang :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Pullik avtoturargoh");

        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendLocation parkingmap(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.213113);
        sendLocation.setLongitude(41.233225);
        return sendLocation;
    }
    public SendMessage parkingmessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Sergeli moshina bozor orqasi \n Xavfsiz avtoturargoh \nYuk mashinalari to'xtash joyi");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage carwashtext(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("tanlang :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Avtomoyka");
        row.add(button);
        rowList.add(row);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Robot yuvadigan");
        row2.add(button2);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage carwashtextmanzilavtomoyka(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Manzilni tanlang :");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Toshkent shaxar , Chilonzor tumani, Arnasoy ko‘chasi");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage carwashtextmanzilrobot(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Manzilni tanlang :");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Toshkent shahri, Chilonzor tumani,\n Katta-Qozirobod mahalla fuqarolar yig‘ini");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendLocation carwashLocationrobot(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.278668);
        sendLocation.setLongitude(69.216377);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendLocation carwashLocationAvtomoyka(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.27511);
        sendLocation.setLongitude(69.224225);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendMessage menuehtiyotqismmanzilrobot(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Manzilni tanlang :");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Kocha. Ahmad Donish, 12");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mirzo Ulug‘bek tumani, Yalangach massivi, ko‘ch. Shahriobod, 44");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("st. Buyuk Ipak Yo‘li, 299");
        row1.add(button2);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Toshkent sh., Shayxontoxur tumani, Nurafshon aylanma ko‘chasi");
        row1.add(button3);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Mirobod tumani, Kichik halqa yo‘li, 7A");
        row2.add(button4);
        rowList.add(row2);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("st. Sokin, 16A");
        row2.add(button5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendLocation ehtiyotqisimlardokoni(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.342900);
        sendLocation.setLongitude(41.311054);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendLocation mirzoulugbek(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.342900);
        sendLocation.setLongitude(41.311054);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendLocation buyukipakyoli(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.342900);
        sendLocation.setLongitude(41.311054);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendLocation shayxontoxurtumani(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.209075);
        sendLocation.setLongitude(41.312379);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendLocation mirobod(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.382692);
        sendLocation.setLongitude(41.313125);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendLocation sokin(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(69.382692);
        sendLocation.setLongitude(41.313125);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);
        return sendLocation;

    }
    public SendMessage mashina(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang: ");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Wheels");
        row.add(button);
        rowList.add(row);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Tires");
        row.add(button2);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Seats");
        row1.add(button1);
        rowList.add(row1);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Bumper");
        row1.add(button3);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Hood");
        row2.add(button4);
        rowList.add(row2);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Roof");
        row2.add(button5);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Mirrors");
        row3.add(button6);
        rowList.add(row3);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Orqaga");
        row3.add(button7);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto wheels(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/dx8PRAY1nBj7NWpw7"));
        sendPhoto.setCaption("Eng sifatli bolgan har xil turdagi diskalar.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto Tires(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/Nvxcm1fBKGpc2AEF9"));
        sendPhoto.setCaption("Eng sifatli bo'lgan shinalar hoxlagan mashinangizga turli xil shinalar hamyonbop narxlarda.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto Seats(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/NpS6LnSm6TephPu69"));
        sendPhoto.setCaption("Turli xil mashinalar o'rindiqlari o'zingizga yoqgan o'rindiqni tanlab hamyonbop narxlarda olib ketishingi mumkin.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto Bumper(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/Gr5VQaczZofsiSeA7"));
        sendPhoto.setCaption("Hoxlagan mashinangizga bumfer bizda mavjud xohlagan rangingizda eng arzon narxlarda olib ketishingiz mumkin boladi.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto Hood(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/MCiKDbjmsuEJ6iyo7"));
        sendPhoto.setCaption("Mashinalar uchun turli xildagi kapotlar bizda mavjud.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto Roof(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/ZMVhqzXqnGquUQT88"));
        sendPhoto.setCaption("Mashinalar tomiga xohlagan turdagi yuk bagajniklari mavjud eng arzon narxlarda olib ketishingiz mumkin boladi.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto Mirrors(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/SZ9yUg2661xU4woY9"));
        sendPhoto.setCaption("Istagan mashinangiz uchun har xil turdagi mashinalar oynasi arxon narxlarda olib ketishingiz mumkin.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Orqaga");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        return sendPhoto;
    }
    public SendMessage manzillar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Jo'nating: ");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Tel: nomer");
        row.add(button);
        rowList.add(row);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Manzilim");
        row.add(button2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage shareContact(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Tel: yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Orqaga");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup((replyKeyboardMarkup));
        return sendMessage;
    }
    public SendMessage shareLocation(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos lokatsiyangizni jonating");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("ShareLokation");
        button.setRequestLocation(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Orqaga");
        row1.add(button1);
        rowList.add(row1);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
}
