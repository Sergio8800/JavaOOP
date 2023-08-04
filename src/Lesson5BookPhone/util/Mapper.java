package Lesson5BookPhone.util;

import Lesson5BookPhone.Model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
