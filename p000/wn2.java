package p000;

import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wn2 implements mb4 {

    /* JADX INFO: renamed from: b */
    public static final Object f33516b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile wn2 f33517c;

    /* JADX INFO: renamed from: a */
    public byte f33518a;

    /* JADX WARN: Multi-variable type inference failed */
    public wn2(int i) {
        this.f33518a = i;
    }

    /* JADX INFO: renamed from: e */
    public static wn2 m12326e() {
        wn2 wn2Var;
        synchronized (f33516b) {
            try {
                if (f33517c == null) {
                    f33517c = new wn2(3);
                }
                wn2Var = f33517c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wn2Var;
    }

    /* JADX INFO: renamed from: g */
    public static String m12327g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // p000.mb4
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo8265a(StackTraceElement[] stackTraceElementArr) {
        int i;
        byte b = this.f33518a;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < b) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    /* JADX INFO: renamed from: b */
    public void m12328b(String str, String str2) {
        if (this.f33518a <= 3) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m12329c(String str, String str2) {
        if (this.f33518a <= 6) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12330d(String str, String str2, Throwable th) {
        if (this.f33518a <= 6) {
            Log.e(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m12331f(String str, String str2) {
        if (this.f33518a <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12332h(String str, String str2) {
        if (this.f33518a <= 5) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12333i(String str, String str2, Exception exc) {
        if (this.f33518a <= 5) {
            Log.w(str, str2, exc);
        }
    }
}
