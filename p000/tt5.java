package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tt5 {

    /* JADX INFO: renamed from: a */
    public final is5 f31432a;

    /* JADX INFO: renamed from: b */
    public boolean f31433b;

    /* JADX INFO: renamed from: c */
    public long f31434c;

    /* JADX INFO: renamed from: d */
    public long f31435d;

    public tt5(is5 is5Var) {
        if (is5Var != null) {
            this.f31432a = is5Var;
        } else {
            xy4.m12782k("ticker");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11159a() {
        if (this.f31433b) {
            C1077qn.m9989o("This stopwatch is already running.");
        } else {
            this.f31433b = true;
            this.f31435d = this.f31432a.m6930a();
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jM6930a = this.f31433b ? (this.f31432a.m6930a() - this.f31435d) + this.f31434c : this.f31434c;
        long j = jM6930a / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jM6930a / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jM6930a / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jM6930a / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jM6930a / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jM6930a / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jM6930a / timeUnit2.convert(1L, timeUnit)));
        switch (qt5.f28792a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return zi4.m13621u(str2, " ", str);
    }
}
