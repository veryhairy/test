package Study.decorator;

import Study.componet.饮品;

public class 兑水Decorator extends Decorator{
    public 兑水Decorator(饮品 yp) {
        super(yp);
    }

    @Override
    public int price() {
        return yp.price()-100;
    }

    @Override
    public String getName() {
        return "兑水的"+yp.getName();
    }
}
