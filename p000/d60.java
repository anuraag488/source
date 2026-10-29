package p000;

import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d60 {

    /* JADX INFO: renamed from: a */
    public final bo3 f16802a;

    /* JADX INFO: renamed from: b */
    public final c60 f16803b;

    /* JADX INFO: renamed from: c */
    public final Date f16804c;

    /* JADX INFO: renamed from: d */
    public final String f16805d;

    /* JADX INFO: renamed from: e */
    public final Date f16806e;

    /* JADX INFO: renamed from: f */
    public final String f16807f;

    /* JADX INFO: renamed from: g */
    public final Date f16808g;

    /* JADX INFO: renamed from: h */
    public final long f16809h;

    /* JADX INFO: renamed from: i */
    public final long f16810i;

    /* JADX INFO: renamed from: j */
    public final String f16811j;

    /* JADX INFO: renamed from: k */
    public final int f16812k;

    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[EDGE_INSN: B:12:0x0043->B:35:0x00a0 BREAK  A[LOOP:1: B:19:0x0067->B:30:0x0097]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf A[EDGE_INSN: B:43:0x00bf->B:66:0x0118 BREAK  A[LOOP:2: B:50:0x00e4->B:61:0x0111]] */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    public d60(bo3 bo3Var, c60 c60Var) {
        int i;
        int i2;
        Date date;
        Date date2;
        Date date3;
        DateFormat simpleDateFormat;
        this.f16802a = bo3Var;
        this.f16803b = c60Var;
        this.f16812k = -1;
        if (c60Var != null) {
            this.f16809h = c60Var.f15830c;
            this.f16810i = c60Var.f15831d;
            uv1 uv1Var = c60Var.f15833f;
            int size = uv1Var.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                String strM11658b = uv1Var.m11658b(i4);
                if (od4.m9039T(strM11658b, "Date", true)) {
                    String strM11657a = uv1Var.m11657a("Date");
                    if (strM11657a == null) {
                        date3 = null;
                        break;
                    }
                    C0753i8 c0753i8 = xu0.f34625a;
                    if (strM11657a.length() == 0) {
                        date3 = null;
                        break;
                    }
                    ParsePosition parsePosition = new ParsePosition(i3);
                    Date date4 = ((DateFormat) xu0.f34625a.get()).parse(strM11657a, parsePosition);
                    if (parsePosition.getIndex() == strM11657a.length()) {
                        date3 = date4;
                    } else {
                        String[] strArr = xu0.f34626b;
                        synchronized (strArr) {
                            try {
                                int length = strArr.length;
                                int i5 = i3;
                                while (true) {
                                    if (i5 >= length) {
                                        date3 = null;
                                        break;
                                    }
                                    DateFormat[] dateFormatArr = xu0.f34627c;
                                    DateFormat dateFormat = dateFormatArr[i5];
                                    if (dateFormat == null) {
                                        simpleDateFormat = new SimpleDateFormat(xu0.f34626b[i5], Locale.US);
                                        simpleDateFormat.setTimeZone(zv4.f36419e);
                                        dateFormatArr[i5] = simpleDateFormat;
                                        i3 = 0;
                                    } else {
                                        simpleDateFormat = dateFormat;
                                    }
                                    parsePosition.setIndex(i3);
                                    Date date5 = simpleDateFormat.parse(strM11657a, parsePosition);
                                    if (parsePosition.getIndex() != 0) {
                                        date3 = date5;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = 0;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this.f16804c = date3;
                    this.f16805d = uv1Var.m11660d(i4);
                } else {
                    if (od4.m9039T(strM11658b, "Expires", true)) {
                        String strM11657a2 = uv1Var.m11657a("Expires");
                        if (strM11657a2 == null) {
                            date2 = null;
                            break;
                        }
                        C0753i8 c0753i9 = xu0.f34625a;
                        if (strM11657a2.length() == 0) {
                            date2 = null;
                            break;
                        }
                        ParsePosition parsePosition2 = new ParsePosition(0);
                        Date date6 = ((DateFormat) xu0.f34625a.get()).parse(strM11657a2, parsePosition2);
                        if (parsePosition2.getIndex() == strM11657a2.length()) {
                            date2 = date6;
                        } else {
                            String[] strArr2 = xu0.f34626b;
                            synchronized (strArr2) {
                                try {
                                    int length2 = strArr2.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= length2) {
                                            date2 = null;
                                            break;
                                        }
                                        DateFormat[] dateFormatArr2 = xu0.f34627c;
                                        DateFormat simpleDateFormat2 = dateFormatArr2[i6];
                                        if (simpleDateFormat2 == null) {
                                            simpleDateFormat2 = new SimpleDateFormat(xu0.f34626b[i6], Locale.US);
                                            simpleDateFormat2.setTimeZone(zv4.f36419e);
                                            dateFormatArr2[i6] = simpleDateFormat2;
                                        }
                                        parsePosition2.setIndex(0);
                                        date2 = simpleDateFormat2.parse(strM11657a2, parsePosition2);
                                        if (parsePosition2.getIndex() != 0) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        this.f16808g = date2;
                    } else if (od4.m9039T(strM11658b, "Last-Modified", true)) {
                        String strM11657a3 = uv1Var.m11657a("Last-Modified");
                        if (strM11657a3 == null) {
                            i = 0;
                            date = null;
                            break;
                        }
                        C0753i8 c0753i10 = xu0.f34625a;
                        if (strM11657a3.length() == 0) {
                            i = 0;
                        } else {
                            ParsePosition parsePosition3 = new ParsePosition(0);
                            Date date7 = ((DateFormat) xu0.f34625a.get()).parse(strM11657a3, parsePosition3);
                            if (parsePosition3.getIndex() == strM11657a3.length()) {
                                date = date7;
                                i = 0;
                            } else {
                                String[] strArr3 = xu0.f34626b;
                                synchronized (strArr3) {
                                    try {
                                        int length3 = strArr3.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length3) {
                                                i = 0;
                                            } else {
                                                DateFormat[] dateFormatArr3 = xu0.f34627c;
                                                DateFormat simpleDateFormat3 = dateFormatArr3[i7];
                                                if (simpleDateFormat3 == null) {
                                                    simpleDateFormat3 = new SimpleDateFormat(xu0.f34626b[i7], Locale.US);
                                                    simpleDateFormat3.setTimeZone(zv4.f36419e);
                                                    dateFormatArr3[i7] = simpleDateFormat3;
                                                }
                                                i = 0;
                                                parsePosition3.setIndex(0);
                                                date = simpleDateFormat3.parse(strM11657a3, parsePosition3);
                                                if (parsePosition3.getIndex() != 0) {
                                                    break;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                        date = null;
                        break;
                        this.f16806e = date;
                        this.f16807f = uv1Var.m11660d(i4);
                    } else {
                        i = 0;
                        if (od4.m9039T(strM11658b, "ETag", true)) {
                            this.f16811j = uv1Var.m11660d(i4);
                        } else if (od4.m9039T(strM11658b, "Age", true)) {
                            String strM11660d = uv1Var.m11660d(i4);
                            Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                            Long lM9045Z = od4.m9045Z(strM11660d);
                            if (lM9045Z != null) {
                                long jLongValue = lM9045Z.longValue();
                                i2 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                            } else {
                                i2 = -1;
                            }
                            this.f16812k = i2;
                        }
                    }
                    i4++;
                    i3 = i;
                }
                i = 0;
                i4++;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX INFO: renamed from: a */
    public final e60 m4380a() {
        String string;
        long time;
        int i;
        bo3 bo3Var = this.f16802a;
        uv1 uv1Var = bo3Var.f15464c;
        dz1 dz1Var = bo3Var.f15462a;
        c60 c60Var = this.f16803b;
        if (c60Var == null) {
            return new e60(bo3Var, null);
        }
        pg2 pg2Var = c60Var.f15828a;
        if (dz1Var.f17526i && !c60Var.f15832e) {
            return new e60(bo3Var, null);
        }
        x50 x50Var = (x50) pg2Var.getValue();
        if (bo3Var.m3643a().f33995b || ((x50) pg2Var.getValue()).f33995b || z62.m13387o(c60Var.f15833f.m11657a("Vary"), "*")) {
            return new e60(bo3Var, null);
        }
        x50 x50VarM3643a = bo3Var.m3643a();
        if (!x50VarM3643a.f33994a) {
            String str = "If-Modified-Since";
            if (uv1Var.m11657a("If-Modified-Since") == null && uv1Var.m11657a("If-None-Match") == null) {
                long time2 = this.f16810i;
                Date date = this.f16804c;
                long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.f16812k;
                if (i2 != -1) {
                    jMax = Math.max(jMax, timeUnit.toMillis(i2));
                }
                long time3 = this.f16809h;
                long jLongValue = jMax + (time2 - time3) + (((Number) tm4.f31240a.invoke()).longValue() - time2);
                int i3 = ((x50) pg2Var.getValue()).f33996c;
                Date date2 = this.f16806e;
                if (i3 != -1) {
                    time = timeUnit.toMillis(i3);
                } else {
                    Date date3 = this.f16808g;
                    if (date3 != null) {
                        if (date != null) {
                            time2 = date.getTime();
                        }
                        time = date3.getTime() - time2;
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (date2 == null) {
                        time = 0;
                    } else {
                        ArrayList arrayList = dz1Var.f17523f;
                        if (arrayList == null) {
                            string = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            q50.m9730n(arrayList, sb);
                            string = sb.toString();
                        }
                        if (string != null) {
                            time = 0;
                        } else {
                            if (date != null) {
                                time3 = date.getTime();
                            }
                            long time4 = time3 - date2.getTime();
                            if (time4 > 0) {
                                time = time4 / 10;
                            } else {
                                time = 0;
                            }
                        }
                    }
                }
                int i4 = x50VarM3643a.f33996c;
                if (i4 != -1) {
                    time = Math.min(time, timeUnit.toMillis(i4));
                }
                int i5 = x50VarM3643a.f34002i;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                long millis2 = (x50Var.f34000g || (i = x50VarM3643a.f34001h) == -1) ? 0L : timeUnit.toMillis(i);
                if (!x50Var.f33994a && jLongValue + millis < time + millis2) {
                    return new e60(null, c60Var);
                }
                String str2 = this.f16811j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date2 != null) {
                    str2 = this.f16807f;
                } else {
                    if (date == null) {
                        return new e60(bo3Var, null);
                    }
                    str2 = this.f16805d;
                }
                C1122rv c1122rvM3644b = bo3Var.m3644b();
                tv1 tv1Var = (tv1) c1122rvM3644b.f29653d;
                tv1Var.getClass();
                sj3.m10817m(str);
                sj3.m10818n(str2, str);
                tv1Var.m11165a(str, str2);
                return new e60(c1122rvM3644b.m10450i(), c60Var);
            }
        }
        return new e60(bo3Var, null);
    }
}
