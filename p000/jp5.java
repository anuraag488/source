package p000;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp5 {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f22509a;

    /* JADX INFO: renamed from: b */
    public static final DecimalFormat f22510b;

    static {
        Locale locale = Locale.ROOT;
        f22509a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f22510b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
