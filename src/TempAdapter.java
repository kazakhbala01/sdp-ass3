public class TempAdapter implements weatherAdapter{
    private weather imperic;

    public TempAdapter(weather imperic) {
        this.imperic=imperic;
    }

    @Override
    public int getTemp() {
        return convertCelsToFarenh(imperic.getTemp());
    }
    private int convertCelsToFarenh(int cels){
        int ToFahren=(cels*(9/5))+32;
        return ToFahren;
    }
}
