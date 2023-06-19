package gui.project.ex00;

import kotlin.random.Random.Default;
import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;

public class MySms {
    public static void main(String[] args) {

        DefaultMessageService messageService = NurigoApp.INSTANCE.initialize("NCST21B9G3X8LSNC",
                "FFTVWJNZYTDEPDPMCU5MNHQHVP6UVW5M",
                "https://api.coolsms.co.kr");

        Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom("01021280056");
        message.setTo("01050112323");
        message.setText("윤지환 입니다. 저는 윤지희 님의 휴대폰을 해킹 하였습니다.^^");

        SingleMessageSentResponse response = messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println(response);

    }
}
