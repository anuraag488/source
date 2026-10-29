package p000;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.invoke.VarHandle;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zv4 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f36415a;

    /* JADX INFO: renamed from: b */
    public static final uv1 f36416b = sj3.m10830z(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final rk3 f36417c;

    /* JADX INFO: renamed from: d */
    public static final a63 f36418d;

    /* JADX INFO: renamed from: e */
    public static final TimeZone f36419e;

    /* JADX INFO: renamed from: f */
    public static final cm3 f36420f;

    /* JADX INFO: renamed from: g */
    public static final String f36421g;

    static {
        byte[] bArr = new byte[0];
        f36415a = bArr;
        w30 w30Var = new w30();
        w30Var.m12051L(0, bArr);
        rk3 rk3Var = new rk3();
        rk3Var.f29376c = null;
        rk3Var.f29375b = 0L;
        rk3Var.f29377d = w30Var;
        VarHandle.storeStoreFence();
        f36417c = rk3Var;
        m13807b(0L, 0L, 0L);
        s50[] s50VarArr = {sc6.m10683x("efbbbf"), sc6.m10683x("feff"), sc6.m10683x("fffe"), sc6.m10683x("0000ffff"), sc6.m10683x("ffff0000")};
        C1374yn c1374yn = new C1374yn();
        c1374yn.f35341a = s50VarArr;
        c1374yn.f35342b = false;
        VarHandle.storeStoreFence();
        ArrayList arrayList = new ArrayList(c1374yn);
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(kx5.m7738v(arrayList, s50VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((s50) arrayList.get(0)).mo4261b() <= 0) {
            C1077qn.m9987m("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            s50 s50Var = (s50) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                s50 s50Var2 = (s50) arrayList.get(i6);
                s50Var2.getClass();
                if (!s50Var2.mo4268k(0, s50Var, s50Var.mo4261b())) {
                    break;
                }
                if (s50Var2.mo4261b() == s50Var.mo4261b()) {
                    throw new IllegalArgumentException(("duplicate option: " + s50Var2).toString());
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        w30 w30Var2 = new w30();
        C0006a5.m72j(0L, w30Var2, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (w30Var2.f33056b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = w30Var2.m12070v();
        }
        s50[] s50VarArr2 = (s50[]) Arrays.copyOf(s50VarArr, 5);
        a63 a63Var = new a63();
        a63Var.f141a = s50VarArr2;
        a63Var.f142b = iArr;
        VarHandle.storeStoreFence();
        f36418d = a63Var;
        f36419e = TimeZone.getTimeZone("GMT");
        f36420f = new cm3("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String strM6349o0 = hd4.m6349o0(h33.class.getName(), "okhttp3.");
        if (hd4.m6338d0(strM6349o0, "Client")) {
            strM6349o0 = strM6349o0.substring(0, strM6349o0.length() - 6);
        }
        f36421g = strM6349o0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13806a(dz1 dz1Var, dz1 dz1Var2) {
        return z62.m13387o(dz1Var.f17521d, dz1Var2.f17521d) && dz1Var.f17522e == dz1Var2.f17522e && z62.m13387o(dz1Var.f17518a, dz1Var2.f17518a);
    }

    /* JADX INFO: renamed from: b */
    public static final void m13807b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13808c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13809d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!z62.m13387o(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m13810e(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (hd4.m6336b0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m13811f(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static final String m13812g(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m13813h(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C1018p1 c1018p1M13010K = y70.m13010K(strArr2);
                while (c1018p1M13010K.hasNext()) {
                    if (comparator.compare(str, (String) c1018p1M13010K.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final long m13814i(xo3 xo3Var) {
        String strM11657a = xo3Var.f34499f.m11657a("Content-Length");
        if (strM11657a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM11657a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final List m13815j(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(kx5.m7694Y(Arrays.copyOf(objArr2, objArr2.length)));
    }

    /* JADX INFO: renamed from: k */
    public static final int m13816k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (z62.m13393u(cCharAt, 31) <= 0 || z62.m13393u(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static final int m13817l(int i, String str, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: m */
    public static final int m13818m(int i, String str, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static final String[] m13819n(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m13820o(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: p */
    public static final int m13821p(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: q */
    public static final Charset m13822q(k40 k40Var, Charset charset) {
        int iMo3036s = k40Var.mo3036s(f36418d);
        if (iMo3036s == -1) {
            return charset;
        }
        if (iMo3036s == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iMo3036s == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iMo3036s == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iMo3036s == 3) {
            Charset charset2 = z80.f35863a;
            Charset charset3 = z80.f35865c;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            z80.f35865c = charsetForName;
            return charsetForName;
        }
        if (iMo3036s != 4) {
            throw new AssertionError();
        }
        Charset charset4 = z80.f35863a;
        Charset charset5 = z80.f35864b;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        z80.f35864b = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: r */
    public static final int m13823r(ak3 ak3Var) {
        return (ak3Var.m3026e() & 255) | ((ak3Var.m3026e() & 255) << 16) | ((ak3Var.m3026e() & 255) << 8);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m13824s(ja4 ja4Var, int i) {
        long jNanoTime = System.nanoTime();
        long jMo7563c = ja4Var.mo3025c().mo7565e() ? ja4Var.mo3025c().mo7563c() - jNanoTime : Long.MAX_VALUE;
        ja4Var.mo3025c().mo7564d(Math.min(jMo7563c, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            w30 w30Var = new w30();
            while (ja4Var.mo3038w(w30Var, 8192L) != -1) {
                w30Var.m12048D(w30Var.f33056b);
            }
            if (jMo7563c == Long.MAX_VALUE) {
                ja4Var.mo3025c().mo7561a();
                return true;
            }
            ja4Var.mo3025c().mo7564d(jNanoTime + jMo7563c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo7563c == Long.MAX_VALUE) {
                ja4Var.mo3025c().mo7561a();
                return false;
            }
            ja4Var.mo3025c().mo7564d(jNanoTime + jMo7563c);
            return false;
        } catch (Throwable th) {
            if (jMo7563c == Long.MAX_VALUE) {
                ja4Var.mo3025c().mo7561a();
            } else {
                ja4Var.mo3025c().mo7564d(jNanoTime + jMo7563c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final uv1 m13825t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sv1 sv1Var = (sv1) it.next();
            s50 s50Var = sv1Var.f30586a;
            s50 s50Var2 = sv1Var.f30587b;
            String strM10524o = s50Var.m10524o();
            String strM10524o2 = s50Var2.m10524o();
            arrayList.add(strM10524o);
            arrayList.add(hd4.m6360z0(strM10524o2).toString());
        }
        return new uv1((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: u */
    public static final String m13826u(dz1 dz1Var, boolean z) {
        int i;
        int i2 = dz1Var.f17522e;
        String strM13617q = dz1Var.f17521d;
        if (hd4.m6335a0(strM13617q, ":", false)) {
            strM13617q = zi4.m13617q(']', "[", strM13617q);
        }
        if (!z) {
            String str = dz1Var.f17518a;
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strM13617q;
            }
        }
        return strM13617q + ':' + i2;
    }

    /* JADX INFO: renamed from: v */
    public static final List m13827v(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: w */
    public static final int m13828w(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
