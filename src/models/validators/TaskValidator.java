package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    //バリデーションを実行する
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        String contetn_error =validateContent(t.getContent());
        if(!contetn_error.equals("")) {
            errors.add(contetn_error);
        }

        return errors;
    }

        //タスク内容の必須入力チェック
        private static String validateContent(String content) {
            if(content == null || content.equals("")) {
                return "タスク内容を入力してください。";
            }
            return "";
        }
    }