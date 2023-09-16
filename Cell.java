public class Cell {

    private boolean isShip;

    public Cell(boolean isShip) {
        this.isShip = isShip;
    }

    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    @Override
    public String toString() {
        if (isShip) {
            return "\uD83D\uDEA2";
        }
        else {
            return " ";
        }
    }


}
