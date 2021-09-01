package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Message;

public class MessageValidator {
    //バリデーションを実行する
    public static List<String> validate(Message m) {
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(m.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String contetn_error =validateContent(m.getContent());
        if(!contetn_error.equals("")) {
            errors.add(contetn_error);
        }

        return errors;
    }

        //タスク名の必須入力チェック
        private static String validateTitle(String title) {
            if(title ==null || title.equals("")) {
                return "タスク名を入力してください。";
            }
            return "";
        }

        //タスク内容の必須入力チェック
        private static String validateContent(String content) {
            if(content == null || content.equals("")) {
                return "タスク内容を入力してください。";
            }
            return "";
        }
    }