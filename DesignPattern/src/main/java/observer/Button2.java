package observer;

public class Button2 {

    private OnClickListener2 onClickListener;//멤버 변수

    public void setOnClickListener(OnClickListener2 onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        //이벤트 처리
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public interface OnClickListener2 {
        public void onClick(Button2 button);
    }
}
