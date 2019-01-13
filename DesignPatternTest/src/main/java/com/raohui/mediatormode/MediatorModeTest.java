package com.raohui.mediatormode;

/**
 * MediatorModeTest
 */
public class MediatorModeTest {
    public static void main(String agrs[]) {
        ConcreteMediator mediator =  new ConcreteMediator();
        Button button = new Button();
        TextBox textBox = new TextBox();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        button.SetMediator(mediator);
        textBox.SetMediator(mediator);
        list.SetMediator(mediator);
        comboBox.SetMediator(mediator);

        mediator.setButton(button);
        mediator.setComboBox(comboBox);
        mediator.setList(list);
        mediator.setTextBox(textBox);
        button.change();
        System.out.println("-----------------------");
        list.change();
    }

}

abstract class Mediator {
    public abstract void componentChanged(Component c);

}

class ConcreteMediator extends Mediator {
    private Button addButton;
    private List list;
    private TextBox userNameTextBox;
    private ComboBox cb;

    @Override
    public void componentChanged(Component c) {
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        // 从列表框选择客户
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        // 从组合框选择客户
        else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }

    }

    /**
     * @return the comboBox
     */
    public ComboBox getComboBox() {
        return cb;
    }

    /**
     * @param comboBox the comboBox to set
     */
    public void setComboBox(ComboBox comboBox) {
        this.cb = comboBox;
    }

    /**
     * @return the textBox
     */
    public TextBox getTextBox() {
        return userNameTextBox;
    }

    /**
     * @param textBox the textBox to set
     */
    public void setTextBox(TextBox textBox) {
        this.userNameTextBox = textBox;
    }

    /**
     * @return the list
     */
    public List getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List list) {
        this.list = list;
    }

    /**
     * @return the button
     */
    public Button getButton() {
        return addButton;
    }

    /**
     * @param button the button to set
     */
    public void setButton(Button button) {
        this.addButton = button;
    }

}

abstract class Component {
    private Mediator mediator;

    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void change() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}

class Button extends Component {

    @Override
    public void update() {

    }

}

class TextBox extends Component {

    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }

}

class List extends Component {

    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }

}

class ComboBox extends Component {

    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }

}