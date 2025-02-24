package tadjik.ilyosjon;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private MyBotService myBotService=new MyBotService();
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            if (update.hasMessage() && update.getMessage().hasText()) {
                Long chatId = update.getMessage().getChatId();
                String text = update.getMessage().getText();
                String firstName = update.getMessage().getChat().getFirstName();
                String lastName = update.getMessage().getChat().getLastName();
                System.out.println(chatId + ": " + firstName + " " + lastName+ " " + text);
                if (text.equals("/start")){

                    try {
                        execute(myBotService.sendMessage(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (text.equals("O`zbek tili")){
                    try {
                        execute(myBotService.menu(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (text.equals("ShareContact")){
                    try {
                        execute(myBotService.menu(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }

                //stattion
                if (text.equals("Station")){

                    try {
                        execute(myBotService.region(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (text.equals("Sergeli")){

                    try {
                        execute(myBotService.station(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (text.equals("Gasoline")){
                    try {
                        execute(myBotService.gasoline1(chatId));
                        execute(myBotService.gasoline1Text(chatId));
                        execute(myBotService.gasoline2(chatId));
                        execute(myBotService.gasoline2Text(chatId));
                        execute(myBotService.gasoline3(chatId));
                        execute(myBotService.gasoline3Text(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (text.equals("ElectroCarCharger")){
                    try {
                        execute(myBotService.charger1Text(chatId));
                        execute(myBotService.charger1(chatId));
                        execute(myBotService.charger2Text(chatId));
                        execute(myBotService.charger2(chatId));
                        execute(myBotService.charger3Text(chatId));
                        execute(myBotService.charger3(chatId));
                        execute(myBotService.charger4Text(chatId));
                        execute(myBotService.charger4(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }

                }
                if (text.equals("BusStation")){
                    try {
                        execute(myBotService.busStation1Text(chatId));
                        execute(myBotService.busStation1(chatId));
                        execute(myBotService.busStation2Text(chatId));
                        execute(myBotService.busStation2(chatId));
                        execute(myBotService.busStation3Text(chatId));
                        execute(myBotService.busStation3(chatId));
                        execute(myBotService.busStation4Text(chatId));
                        execute(myBotService.busStation4(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }

                }
                if (text.equals("◀\uFE0F Orqaga")){
                    try {
                        execute(myBotService.menu(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }

                //CARSERVICE
                if(text.equals("Map")){
                    try {
                        execute(myBotService.region1(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Sergeli tumani")){
                    try {
                        execute(myBotService.parkingname(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Pullik avtoturargoh")){
                    try {
                        execute(myBotService.parkingmap(chatId));
                        execute(myBotService.parkingmessage(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Orqaga")){
                    try {
                        execute(myBotService.start(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("CarWash")){
                    try {
                        execute(myBotService.carwashtext(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Avtomoyka")){
                    try {
                        execute(myBotService.carwashtextmanzilavtomoyka(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Robot yuvadigan")){
                    try {
                        execute(myBotService.carwashtextmanzilrobot(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Toshkent shaxar , Chilonzor tumani, Arnasoy ko‘chasi")){
                    try {
                        execute(myBotService.carwashLocationAvtomoyka(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Toshkent shahri, Chilonzor tumani,\n Katta-Qozirobod mahalla fuqarolar yig‘ini")){
                    try {
                        execute(myBotService.carwashLocationrobot(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("RepairEngineShop")){
                    try {
                        execute(myBotService.menuehtiyotqismmanzilrobot(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Kocha. Ahmad Donish, 12")){
                    try {
                        execute(myBotService.ehtiyotqisimlardokoni(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Mirzo Ulug‘bek tumani, Yalangach massivi, ko‘ch. Shahriobod, 44")){
                    try {
                        execute(myBotService.mirzoulugbek(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("st. Buyuk Ipak Yo‘li, 299")){
                    try {
                        execute(myBotService.buyukipakyoli(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Toshkent sh., Shayxontoxur tumani, Nurafshon aylanma ko‘chasi")){
                    try {
                        execute(myBotService.shayxontoxurtumani(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Mirobod tumani, Kichik halqa yo‘li, 7A")){
                    try {
                        execute(myBotService.mirobod(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("st. Sokin, 16A")){
                    try {
                        execute(myBotService.sokin(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("CarDetailsShops")){
                    try {
                        execute(myBotService.mashina(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Wheels")){
                    try {
                        execute(myBotService.wheels(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Tires")){
                    try {
                        execute(myBotService.Tires(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Seats")){
                    try {
                        execute(myBotService.Seats(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Bumper")){
                    try {
                        execute(myBotService.Bumper(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Hood")){
                    try {
                        execute(myBotService.Hood(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Roof")){
                    try {
                        execute(myBotService.Roof(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Mirrors")){
                    try {
                        execute(myBotService.Mirrors(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("TowingService")){
                    try {
                        execute(myBotService.manzillar(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Tel: nomer")){
                    try {
                        execute(myBotService.shareContact(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(text.equals("Manzilim")){
                    try {
                        execute(myBotService.shareLocation(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    @Override
    public String getBotUsername() {
        return "HackatonProject_Bot";
    }
    @Override
    public String getBotToken() {
        return "7665290589:AAEpIatzKFUgHY_IvSy2iVp-cKBwgJrxjnU";
    }
}
