package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.inputmethod.HandwritingGesture;
import android.webkit.WebView;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationHandler;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class y62 {

    /* JADX INFO: renamed from: A */
    public static final ro4 f34921A;

    /* JADX INFO: renamed from: B */
    public static final kh5 f34922B;

    /* JADX INFO: renamed from: i */
    public static final pg0 f34931i;

    /* JADX INFO: renamed from: k */
    public static final pg0 f34933k;

    /* JADX INFO: renamed from: v */
    public static final pg0 f34944v;

    /* JADX INFO: renamed from: z */
    public static final ro4 f34948z;

    /* JADX INFO: renamed from: a */
    public static final pg0 f34923a = new pg0(-2027266211, false, new tg0(0));

    /* JADX INFO: renamed from: b */
    public static final pg0 f34924b = new pg0(-1433777540, false, new tg0(1));

    /* JADX INFO: renamed from: c */
    public static final pg0 f34925c = new pg0(845807389, false, new tg0(3));

    /* JADX INFO: renamed from: d */
    public static final pg0 f34926d = new pg0(975671967, false, new tg0(4));

    /* JADX INFO: renamed from: e */
    public static final pg0 f34927e = new pg0(128003170, false, new fh0(21));

    /* JADX INFO: renamed from: f */
    public static final pg0 f34928f = new pg0(-1749951802, false, new tg0(5));

    /* JADX INFO: renamed from: g */
    public static final pg0 f34929g = new pg0(-1627047865, false, new tg0(6));

    /* JADX INFO: renamed from: h */
    public static final pg0 f34930h = new pg0(-1504143928, false, new tg0(7));

    /* JADX INFO: renamed from: j */
    public static final pg0 f34932j = new pg0(-1590902926, false, new tg0(8));

    /* JADX INFO: renamed from: l */
    public static final pg0 f34934l = new pg0(1276013878, false, new fh0(24));

    /* JADX INFO: renamed from: m */
    public static final pg0 f34935m = new pg0(1552823496, false, new tg0(9));

    /* JADX INFO: renamed from: n */
    public static final pg0 f34936n = new pg0(984851273, false, new tg0(10));

    /* JADX INFO: renamed from: o */
    public static final pg0 f34937o = new pg0(416879050, false, new tg0(11));

    /* JADX INFO: renamed from: p */
    public static final pg0 f34938p = new pg0(15595981, false, new fh0(25));

    /* JADX INFO: renamed from: q */
    public static final pg0 f34939q = new pg0(1836980255, false, new fh0(26));

    /* JADX INFO: renamed from: r */
    public static final pg0 f34940r = new pg0(1563050801, false, new tg0(12));

    /* JADX INFO: renamed from: s */
    public static final pg0 f34941s = new pg0(842131379, false, new tg0(13));

    /* JADX INFO: renamed from: t */
    public static final pg0 f34942t = new pg0(1756158710, false, new fh0(19));

    /* JADX INFO: renamed from: u */
    public static final pg0 f34943u = new pg0(772431186, false, new fh0(20));

    /* JADX INFO: renamed from: w */
    public static final Object f34945w = new Object();

    /* JADX INFO: renamed from: x */
    public static final byte[] f34946x = {112, 114, 111, 0};

    /* JADX INFO: renamed from: y */
    public static final byte[] f34947y = {112, 114, 109, 0};

    static {
        byte b = 23;
        f34931i = new pg0(-70071605, false, new fh0(b));
        byte b2 = 22;
        f34933k = new pg0(-505041523, false, new fh0(b2));
        byte b3 = 2;
        f34944v = new pg0(-1315951406, false, new tg0(b3));
        f34948z = new ro4(b2);
        f34921A = new ro4(b);
        f34922B = new kh5(b3);
    }

    /* JADX INFO: renamed from: A */
    public static nr6 m12935A(Exception exc) {
        nr6 nr6Var = new nr6();
        nr6Var.m8830n(exc);
        return nr6Var;
    }

    /* JADX INFO: renamed from: B */
    public static nr6 m12936B(Object obj) {
        nr6 nr6Var = new nr6();
        nr6Var.m8828l(obj);
        return nr6Var;
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m12937C(sl1 sl1Var, C1164t c1164t) {
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sl1 sl1VarM13847K = zy5.m13847K(sl1Var);
                if (sl1VarM13847K != null) {
                    return m12937C(sl1VarM13847K, c1164t) || m12938F(sl1Var, sl1VarM13847K, 1, c1164t);
                }
                C1077qn.m9989o("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return sl1Var.m10855Q0().f19067a ? ((Boolean) c1164t.invoke(sl1Var)).booleanValue() : m12949Q(sl1Var, c1164t);
                }
                C0670g.m5864c();
                return false;
            }
        }
        return m12949Q(sl1Var, c1164t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final boolean m12938F(sl1 sl1Var, sl1 sl1Var2, int i, C1164t c1164t) {
        if (m12968f0(sl1Var, sl1Var2, i, c1164t)) {
            return true;
        }
        sl1 sl1VarM3620f = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).m3620f();
        h43 h43Var = new h43();
        h43Var.f20381a = sl1VarM3620f;
        h43Var.f20382b = sl1Var;
        h43Var.f20383c = sl1Var2;
        h43Var.f20384d = i;
        h43Var.f20385e = c1164t;
        VarHandle.storeStoreFence();
        Boolean bool = (Boolean) zp0.m13665Q(sl1Var, i, h43Var);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static String m12939G(byte[] bArr, String str, String str2) {
        byte[] bArr2 = z62.f35786h;
        byte[] bArr3 = z62.f35787i;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return zi4.m13623w(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: H */
    public static final ArrayList m12940H(s62 s62Var) {
        wf2 wf2VarMo4854E0 = ((so2) s62Var).mo4854E0();
        boolean zM12943K = m12943K(wf2VarMo4854E0);
        List listM12289p = wf2VarMo4854E0.m12289p();
        aw2 aw2Var = (aw2) listM12289p;
        ArrayList arrayList = new ArrayList(((uw2) aw2Var.f14915b).f32213c);
        int size = listM12289p.size();
        for (int i = 0; i < size; i++) {
            wf2 wf2Var = (wf2) aw2Var.get(i);
            arrayList.add(zM12943K ? wf2Var.m12286m() : wf2Var.m12287n());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I */
    public static final String m12941I(C0766im c0766im) {
        String str = c0766im.f21545b;
        if (str.length() <= 0) {
            str = null;
        }
        return str == null ? c0766im.f21544a : str;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m12942J(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m12943K(wf2 wf2Var) {
        int iOrdinal = wf2Var.f33300H.f14471d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            C0670g.m5864c();
                            return false;
                        }
                        wf2 wf2VarM12295v = wf2Var.m12295v();
                        if (wf2VarM12295v != null) {
                            return m12943K(wf2VarM12295v);
                        }
                        C1077qn.m9987m("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m12944L(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: M */
    public static final float m12945M(iv2 iv2Var, iv2 iv2Var2, float f) {
        int iNextInt;
        int i;
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = sc6.m10660c0(0, iv2Var.f21821b).iterator();
        while (true) {
            q52 q52Var = (q52) it;
            if (!q52Var.f28225c) {
                ds3.m4667k("Collection contains no element matching the predicate.");
                return 0.0f;
            }
            iNextInt = q52Var.nextInt();
            float fM6945b = iv2Var.m6945b(iNextInt);
            i = iNextInt + 1;
            float fM6945b2 = iv2Var.m6945b(i % iv2Var.f21821b);
            if (fM6945b2 >= fM6945b) {
                if (fM6945b <= f && f <= fM6945b2) {
                    break;
                }
            } else if (f >= fM6945b || f <= fM6945b2) {
                break;
            }
        }
        int i2 = i % iv2Var.f21821b;
        float fM5415c = ew4.m5415c(iv2Var.m6945b(i2) - iv2Var.m6945b(iNextInt));
        return ew4.m5415c((ew4.m5415c(iv2Var2.m6945b(i2) - iv2Var2.m6945b(iNextInt)) * (fM5415c < 0.001f ? 0.5f : ew4.m5415c(f - iv2Var.m6945b(iNextInt)) / fM5415c)) + iv2Var2.m6945b(iNextInt));
    }

    /* JADX INFO: renamed from: N */
    public static final nt2 m12946N(nt2 nt2Var) {
        lg4 lg4Var = new lg4();
        lg4Var.f24027a = f34921A;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(lg4Var);
    }

    /* JADX INFO: renamed from: O */
    public static void m12947O(long j, C0875lk c0875lk, boolean z, b71 b71Var) {
        if (z) {
            int i = ql4.f28557c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c0875lk, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c0875lk.f24092b.length() ? Character.codePointAt(c0875lk, iCharCount2) : 10;
            if (z62.m13353L(iCodePointBefore) && (z62.m13352K(iCodePointAt) || z62.m13351J(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c0875lk, iCharCount);
                    }
                } while (z62.m13353L(iCodePointBefore));
                j = sc6.m10657b(iCharCount, iCharCount2);
            } else if (z62.m13353L(iCodePointAt) && (z62.m13352K(iCodePointBefore) || z62.m13351J(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c0875lk.f24092b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c0875lk, iCharCount2);
                    }
                } while (z62.m13353L(iCodePointAt));
                j = sc6.m10657b(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        a71[] a71VarArr = {new w34(i2, i2), new ey0(ql4.m9901e(j), 0)};
        cv1 cv1Var = new cv1();
        cv1Var.f16507a = a71VarArr;
        VarHandle.storeStoreFence();
        b71Var.invoke(cv1Var);
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m12948P(sl1 sl1Var, C1164t c1164t) {
        Object[] objArr = new sl1[16];
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitChildren called on an unattached node");
        }
        uw2 uw2Var = new uw2(new mt2[16]);
        mt2 mt2Var = sl1Var.f25195a;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 == null) {
            sc6.m10663e(uw2Var, mt2Var);
        } else {
            uw2Var.m11663b(mt2Var2);
        }
        int i = 0;
        while (true) {
            int i2 = uw2Var.f32213c;
            if (i2 == 0) {
                break;
            }
            mt2 mt2VarM10644P = (mt2) uw2Var.m11672l(i2 - 1);
            if ((mt2VarM10644P.f25198d & 1024) == 0) {
                sc6.m10663e(uw2Var, mt2VarM10644P);
            } else {
                while (mt2VarM10644P != null) {
                    if ((mt2VarM10644P.f25197c & 1024) != 0) {
                        uw2 uw2Var2 = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof sl1) {
                                sl1 sl1Var2 = (sl1) mt2VarM10644P;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = sl1Var2;
                                i = i3;
                            } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                int i4 = 0;
                                for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                    if ((mt2Var3.f25197c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            mt2VarM10644P = mt2Var3;
                                        } else {
                                            if (uw2Var2 == null) {
                                                uw2Var2 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var2.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var2.m11663b(mt2Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var2);
                        }
                        break;
                    }
                    mt2VarM10644P = mt2VarM10644P.f25200f;
                }
            }
        }
        Arrays.sort(objArr, 0, i, vl1.f32715b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                sl1 sl1Var3 = (sl1) objArr[i5];
                if (zy5.m13851O(sl1Var3) && m12985o(sl1Var3, c1164t)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m12949Q(sl1 sl1Var, C1164t c1164t) {
        Object[] objArr = new sl1[16];
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitChildren called on an unattached node");
        }
        uw2 uw2Var = new uw2(new mt2[16]);
        mt2 mt2Var = sl1Var.f25195a;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 == null) {
            sc6.m10663e(uw2Var, mt2Var);
        } else {
            uw2Var.m11663b(mt2Var2);
        }
        int i = 0;
        while (true) {
            int i2 = uw2Var.f32213c;
            if (i2 == 0) {
                break;
            }
            mt2 mt2VarM10644P = (mt2) uw2Var.m11672l(i2 - 1);
            if ((mt2VarM10644P.f25198d & 1024) == 0) {
                sc6.m10663e(uw2Var, mt2VarM10644P);
            } else {
                while (mt2VarM10644P != null) {
                    if ((mt2VarM10644P.f25197c & 1024) != 0) {
                        uw2 uw2Var2 = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof sl1) {
                                sl1 sl1Var2 = (sl1) mt2VarM10644P;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = sl1Var2;
                                i = i3;
                            } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                int i4 = 0;
                                for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                    if ((mt2Var3.f25197c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            mt2VarM10644P = mt2Var3;
                                        } else {
                                            if (uw2Var2 == null) {
                                                uw2Var2 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var2.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var2.m11663b(mt2Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var2);
                        }
                        break;
                    }
                    mt2VarM10644P = mt2VarM10644P.f25200f;
                }
            }
        }
        Arrays.sort(objArr, 0, i, vl1.f32715b);
        for (int i5 = 0; i5 < i; i5++) {
            sl1 sl1Var3 = (sl1) objArr[i5];
            if (zy5.m13851O(sl1Var3) && m12937C(sl1Var3, c1164t)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static final sw2 m12950R(Object obj, Object[] objArr, yp1 yp1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        C0459am c0459am = (C0459am) ir1Var.m6898k(AbstractC0496bm.m3626a());
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zM6890g = ir1Var.m6890g(c0459am) | ir1Var.m6894i(yp1Var);
        Object objM6869O = ir1Var.m6869O();
        wm0 wm0Var = null;
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = new C1031pe(c0459am, yp1Var, (wm0) null);
            ir1Var.m6905n0(objM6869O);
        }
        mq1 mq1Var = (mq1) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = k43.m7398w(obj);
            ir1Var.m6905n0(objM6869O2);
        }
        sw2 sw2Var = (sw2) objM6869O2;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        boolean zM6894i = ir1Var.m6894i(mq1Var);
        Object objM6869O3 = ir1Var.m6869O();
        if (zM6894i || objM6869O3 == i50Var) {
            objM6869O3 = new t94(mq1Var, sw2Var, wm0Var, (byte) 3);
            ir1Var.m6905n0(objM6869O3);
        }
        lb5.m7929j(objArrCopyOf2, (mq1) objM6869O3, ir1Var);
        return sw2Var;
    }

    /* JADX INFO: renamed from: S */
    public static final float m12951S(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    /* JADX INFO: renamed from: V */
    public static int[] m12952V(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM4293H = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM4293H += (int) d24.m4293H(byteArrayInputStream, 2);
            iArr[i2] = iM4293H;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: W */
    public static gz0[] m12953W(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, gz0[] gz0VarArr) throws IOException {
        byte[] bArr3 = z62.f35788j;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, z62.f35789k)) {
                C1077qn.m9989o("Unsupported meta version");
                return null;
            }
            int iM4293H = (int) d24.m4293H(fileInputStream, 2);
            byte[] bArrM4292G = d24.m4292G(fileInputStream, (int) d24.m4293H(fileInputStream, 4), (int) d24.m4293H(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C1077qn.m9989o("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4292G);
            try {
                gz0[] gz0VarArrM12955Y = m12955Y(byteArrayInputStream, bArr2, iM4293H, gz0VarArr);
                byteArrayInputStream.close();
                return gz0VarArrM12955Y;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(z62.f35783e, bArr2)) {
            C1077qn.m9989o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C1077qn.m9989o("Unsupported meta version");
            return null;
        }
        int iM4293H2 = (int) d24.m4293H(fileInputStream, 1);
        byte[] bArrM4292G2 = d24.m4292G(fileInputStream, (int) d24.m4293H(fileInputStream, 4), (int) d24.m4293H(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C1077qn.m9989o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM4292G2);
        try {
            gz0[] gz0VarArrM12954X = m12954X(byteArrayInputStream2, iM4293H2, gz0VarArr);
            byteArrayInputStream2.close();
            return gz0VarArrM12954X;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: X */
    public static gz0[] m12954X(ByteArrayInputStream byteArrayInputStream, int i, gz0[] gz0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new gz0[0];
        }
        if (i != gz0VarArr.length) {
            C1077qn.m9989o("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM4293H = (int) d24.m4293H(byteArrayInputStream, 2);
            iArr[i2] = (int) d24.m4293H(byteArrayInputStream, 2);
            strArr[i2] = new String(d24.m4291F(byteArrayInputStream, iM4293H), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            gz0 gz0Var = gz0VarArr[i3];
            if (!gz0Var.f20203b.equals(strArr[i3])) {
                C1077qn.m9989o("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            gz0Var.f20206e = i4;
            gz0Var.f20209h = m12952V(byteArrayInputStream, i4);
        }
        return gz0VarArr;
    }

    /* JADX INFO: renamed from: Y */
    public static gz0[] m12955Y(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, gz0[] gz0VarArr) throws IOException {
        gz0 gz0Var;
        if (byteArrayInputStream.available() == 0) {
            return new gz0[0];
        }
        if (i != gz0VarArr.length) {
            C1077qn.m9989o("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            d24.m4293H(byteArrayInputStream, 2);
            String str = new String(d24.m4291F(byteArrayInputStream, (int) d24.m4293H(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM4293H = d24.m4293H(byteArrayInputStream, 4);
            int iM4293H = (int) d24.m4293H(byteArrayInputStream, 2);
            if (gz0VarArr.length <= 0) {
                gz0Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= gz0VarArr.length) {
                    gz0Var = null;
                    break;
                }
                if (gz0VarArr[i3].f20203b.equals(strSubstring)) {
                    gz0Var = gz0VarArr[i3];
                    break;
                }
                i3++;
            }
            if (gz0Var == null) {
                C1077qn.m9989o("Missing profile key: ".concat(str));
                return null;
            }
            gz0Var.f20205d = jM4293H;
            int[] iArrM12952V = m12952V(byteArrayInputStream, iM4293H);
            if (Arrays.equals(bArr, z62.f35787i)) {
                gz0Var.f20206e = iM4293H;
                gz0Var.f20209h = iArrM12952V;
            }
        }
        return gz0VarArr;
    }

    /* JADX INFO: renamed from: Z */
    public static gz0[] m12956Z(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, z62.f35784f)) {
            C1077qn.m9989o("Unsupported version");
            return null;
        }
        int iM4293H = (int) d24.m4293H(fileInputStream, 1);
        byte[] bArrM4292G = d24.m4292G(fileInputStream, (int) d24.m4293H(fileInputStream, 4), (int) d24.m4293H(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C1077qn.m9989o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4292G);
        try {
            gz0[] gz0VarArrM12958a0 = m12958a0(byteArrayInputStream, str, iM4293H);
            byteArrayInputStream.close();
            return gz0VarArrM12958a0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12957a(C0766im c0766im, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(784842928);
        int i2 = (ir1Var.m6890g(c0766im) ? 4 : 2) | i;
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            C0638f5.m5530a(c0766im.f21544a, n74.m8579g(kt2.f23428a, 24.0f), false, ir1Var, 48, 4);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1076qm c1076qm = new C1076qm(b);
            c1076qm.f28561b = c0766im;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1076qm;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static gz0[] m12958a0(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new gz0[0];
        }
        gz0[] gz0VarArr = new gz0[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM4293H = (int) d24.m4293H(byteArrayInputStream, 2);
            int iM4293H2 = (int) d24.m4293H(byteArrayInputStream, 2);
            long jM4293H = d24.m4293H(byteArrayInputStream, 4);
            long jM4293H2 = d24.m4293H(byteArrayInputStream, 4);
            long jM4293H3 = d24.m4293H(byteArrayInputStream, 4);
            String str2 = new String(d24.m4291F(byteArrayInputStream, iM4293H), StandardCharsets.UTF_8);
            int i4 = (int) jM4293H;
            int i5 = (int) jM4293H3;
            TreeMap treeMap = new TreeMap();
            gz0 gz0Var = new gz0();
            gz0Var.f20202a = str;
            gz0Var.f20203b = str2;
            gz0Var.f20204c = jM4293H2;
            gz0Var.f20205d = 0L;
            gz0Var.f20206e = iM4293H2;
            gz0Var.f20207f = i4;
            gz0Var.f20208g = i5;
            gz0Var.f20209h = new int[iM4293H2];
            gz0Var.f20210i = treeMap;
            VarHandle.storeStoreFence();
            gz0VarArr[i3] = gz0Var;
        }
        int i6 = 0;
        while (i6 < i) {
            gz0 gz0Var2 = gz0VarArr[i6];
            int iAvailable = byteArrayInputStream.available();
            int i7 = gz0Var2.f20207f;
            int i8 = gz0Var2.f20208g;
            TreeMap treeMap2 = gz0Var2.f20210i;
            int i9 = iAvailable - i7;
            int iM4293H3 = i2;
            while (byteArrayInputStream.available() > i9) {
                iM4293H3 += (int) d24.m4293H(byteArrayInputStream, 2);
                treeMap2.put(Integer.valueOf(iM4293H3), 1);
                int iM4293H4 = (int) d24.m4293H(byteArrayInputStream, 2);
                while (iM4293H4 > 0) {
                    d24.m4293H(byteArrayInputStream, 2);
                    int iM4293H5 = (int) d24.m4293H(byteArrayInputStream, 1);
                    if (iM4293H5 != 6 && iM4293H5 != 7) {
                        while (iM4293H5 > 0) {
                            d24.m4293H(byteArrayInputStream, 1);
                            int i10 = i2;
                            int i11 = i6;
                            for (int iM4293H6 = (int) d24.m4293H(byteArrayInputStream, 1); iM4293H6 > 0; iM4293H6--) {
                                d24.m4293H(byteArrayInputStream, 2);
                            }
                            iM4293H5--;
                            i6 = i11;
                            i2 = i10;
                        }
                    }
                    iM4293H4--;
                    i6 = i6;
                    i2 = i2;
                }
            }
            int i12 = i2;
            int i13 = i6;
            if (byteArrayInputStream.available() != i9) {
                C1077qn.m9989o("Read too much data during profile line parse");
                return null;
            }
            gz0Var2.f20209h = m12952V(byteArrayInputStream, gz0Var2.f20206e);
            BitSet bitSetValueOf = BitSet.valueOf(d24.m4291F(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i8; i14++) {
                int i15 = bitSetValueOf.get(i14) ? 2 : i12;
                if (bitSetValueOf.get(i14 + i8)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer numValueOf = (Integer) treeMap2.get(Integer.valueOf(i14));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i12);
                    }
                    treeMap2.put(Integer.valueOf(i14), Integer.valueOf(i15 | numValueOf.intValue()));
                }
            }
            i6 = i13 + 1;
            i2 = i12;
        }
        return gz0VarArr;
    }

    /* JADX INFO: renamed from: b */
    public static final void m12959b(po3 po3Var, yp1 yp1Var, qq1 qq1Var, String str, mi0 mi0Var, int i) {
        qq1 qq1Var2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1799907554);
        int i2 = (i & 6) == 0 ? (ir1Var.m6890g(po3Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6890g(str) ? 16384 : 8192;
        }
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (i3 & 9363) != 9362)) {
            qq1Var2 = c20.f15761c;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(new xk4(7, 0L, (String) null));
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            if (po3Var instanceof ke4) {
                List list = ((ke4) po3Var).f23085a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String strM12941I = m12941I((C0766im) obj2);
                    Locale locale = Locale.ROOT;
                    if (hd4.m6335a0(hd4.m6360z0(strM12941I.toLowerCase(locale)).toString(), hd4.m6360z0(((xk4) sw2Var.getValue()).f34341a.f24092b.toLowerCase(locale)).toString(), false)) {
                        arrayList.add(obj2);
                    }
                }
                List listM6315a1 = hb0.m6315a1(arrayList, new vl1((byte) 8));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : listM6315a1) {
                    String upperCase = String.valueOf(m12941I((C0766im) obj3).charAt(0)).toUpperCase(Locale.ROOT);
                    Object arrayList2 = linkedHashMap.get(upperCase);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(upperCase, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                List listM5276O = eq2.m5276O(linkedHashMap);
                ke4 ke4Var = new ke4();
                ke4Var.f23085a = listM5276O;
                VarHandle.storeStoreFence();
                obj = ke4Var;
            } else {
                obj = po3Var;
            }
            vf1 vf1Var = n74.f25506c;
            boolean zM6890g = ir1Var.m6890g(obj) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj4 = objM6869O2;
            if (zM6890g || objM6869O2 == i50Var) {
                C1164t c1164t = new C1164t((byte) 4);
                c1164t.f30700c = obj;
                c1164t.f30701d = sw2Var;
                c1164t.f30699b = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj4 = c1164t;
            }
            AbstractC0647fd.m5668f(vf1Var, str, false, null, (yp1) obj4, ir1Var, ((i3 >> 9) & 112) | 6, 12);
        } else {
            ir1Var.m6874W();
            qq1Var2 = qq1Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm(b);
            c0877lm.f24144c = po3Var;
            c0877lm.f24145d = yp1Var;
            c0877lm.f24146e = qq1Var2;
            c0877lm.f24147f = str;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final w94 m12960b0(List list, yp1 yp1Var, ir1 ir1Var, int i, int i2) {
        int i3 = i2 & 2;
        Object obj = ki0.f23136a;
        if (i3 != 0) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == obj) {
                objM6869O = new t63((byte) 11);
                ir1Var.m6905n0(objM6869O);
            }
            yp1Var = (yp1) objM6869O;
        }
        int i4 = i2 & 4;
        byte b = 1;
        int i5 = 0;
        boolean z = i4 == 0;
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (objM6869O2 == obj) {
            w94 w94Var = new w94();
            for (Object obj3 : list) {
                w94Var.add(new C0800jj(yp1Var.invoke(obj3), obj3, !z));
            }
            ir1Var.m6905n0(w94Var);
            obj2 = w94Var;
        }
        w94 w94Var2 = (w94) obj2;
        boolean zM6890g = ir1Var.m6890g(list);
        Object objM6869O3 = ir1Var.m6869O();
        wm0 wm0Var = null;
        if (zM6890g || objM6869O3 == obj) {
            int iM5779K = fq2.m5779K(ib0.m6717y0(w94Var2, 10));
            if (iM5779K < 16) {
                iM5779K = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K);
            ListIterator listIterator = w94Var2.listIterator();
            while (true) {
                ow1 ow1Var = (ow1) listIterator;
                if (!ow1Var.hasNext()) {
                    break;
                }
                Object next = ow1Var.next();
                linkedHashMap.put(((C0800jj) next).f22322a, next);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                Object objInvoke = yp1Var.invoke(obj4);
                if (!linkedHashSet.add(objInvoke)) {
                    xd2.m12669p(objInvoke, "Duplicate key ");
                    return null;
                }
                C0800jj c0800jj = (C0800jj) linkedHashMap.get(objInvoke);
                if (c0800jj == null) {
                    c0800jj = new C0800jj(objInvoke, obj4, false);
                }
                c0800jj.f22323b.setValue(obj4);
                c0800jj.f22324c.f31487g.setValue(Boolean.TRUE);
                arrayList.add(c0800jj);
            }
            ListIterator listIterator2 = w94Var2.listIterator();
            while (true) {
                ow1 ow1Var2 = (ow1) listIterator2;
                if (!ow1Var2.hasNext()) {
                    w94Var2.clear();
                    mb0.m8260A0(w94Var2, arrayList);
                    ir1Var.m6905n0(ju4.f22634a);
                    break;
                }
                Object next2 = ow1Var2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kx5.m7735t0();
                    throw null;
                }
                C0800jj c0800jj2 = (C0800jj) next2;
                if (!linkedHashSet.contains(c0800jj2.f22322a)) {
                    c0800jj2.f22324c.f31487g.setValue(Boolean.FALSE);
                    int size = arrayList.size();
                    if (i5 > size) {
                        i5 = size;
                    }
                    arrayList.add(i5, c0800jj2);
                }
                i5 = i6;
            }
        }
        Object objM6869O4 = ir1Var.m6869O();
        if (objM6869O4 == obj) {
            objM6869O4 = new C0982og(w94Var2, wm0Var, b);
            ir1Var.m6905n0(objM6869O4);
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O4, w94Var2);
        return w94Var2;
    }

    /* JADX INFO: renamed from: c */
    public static final void m12961c(C0766im c0766im, mi0 mi0Var, int i) {
        byte b;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(769490242);
        int i2 = i | (ir1Var.m6890g(c0766im) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            b = 1;
            gl4.m6037b(c0766im.f21545b, k43.m7396u(), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262140);
        } else {
            b = 1;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1076qm c1076qm = new C1076qm(b);
            c1076qm.f28561b = c0766im;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1076qm;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final mq1 m12962c0(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        C0459am c0459am = (C0459am) ir1Var.m6898k(AbstractC0496bm.m3626a());
        boolean zM6890g = ir1Var.m6890g(c0459am) | ir1Var.m6894i(context);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new C0671g0((Object) c0459am, (Object) context, (wm0) null, (byte) 7);
            ir1Var.m6905n0(objM6869O);
        }
        return (mq1) objM6869O;
    }

    /* JADX INFO: renamed from: d */
    public static final void m12963d(po3 po3Var, String str, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1127125199);
        int i3 = ((i & 6) == 0 ? i | 2 : i) | 48;
        if ((i & 384) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 256 : 128;
        }
        byte b = 1;
        if (ir1Var.m6871T(i3 & 1, (i3 & 147) != 146)) {
            ir1Var.m6876Y();
            int i4 = i & 1;
            i50 i50Var = ki0.f23136a;
            if (i4 == 0 || ir1Var.m6856B()) {
                nc4 nc4Var = AndroidCompositionLocals_androidKt.f14651b;
                PackageManager packageManager = ((Context) ir1Var.m6898k(nc4Var)).getPackageManager();
                Object objM6869O = ir1Var.m6869O();
                wm0 wm0Var = null;
                if (objM6869O == i50Var) {
                    objM6869O = new C0872lh(2, wm0Var, b);
                    ir1Var.m6905n0(objM6869O);
                }
                mq1 mq1Var = (mq1) objM6869O;
                boolean zM6894i = ir1Var.m6894i(packageManager) | ir1Var.m6894i(mq1Var);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6894i || objM6869O2 == i50Var) {
                    objM6869O2 = new C0671g0((Object) packageManager, (Object) mq1Var, wm0Var, (byte) 6);
                    ir1Var.m6905n0(objM6869O2);
                }
                mq1 mq1Var2 = (mq1) objM6869O2;
                Context context = (Context) ir1Var.m6898k(nc4Var);
                Object[] objArr = {mq1Var2};
                boolean zM6894i2 = ir1Var.m6894i(context) | ir1Var.m6894i(mq1Var2);
                Object objM6869O3 = ir1Var.m6869O();
                if (zM6894i2 || objM6869O3 == i50Var) {
                    objM6869O3 = new C1150sm(context, mq1Var2, null);
                    ir1Var.m6905n0(objM6869O3);
                }
                po3Var = (po3) m12950R(om2.f26879a, objArr, (yp1) objM6869O3, ir1Var).getValue();
                i2 = i3 & (-15);
                str = "Pick an app";
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-15);
            }
            po3 po3Var2 = po3Var;
            ir1Var.m6913s();
            boolean z = (i2 & 896) == 256;
            Object objM6869O4 = ir1Var.m6869O();
            Object obj = objM6869O4;
            if (z || objM6869O4 == i50Var) {
                C0797jg c0797jg = new C0797jg(b);
                c0797jg.f22228b = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0797jg);
                obj = c0797jg;
            }
            m12959b(po3Var2, (yp1) obj, null, str, ir1Var, (i2 << 9) & 57344);
            po3Var = po3Var2;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf(b);
            c1403zf.f36036c = po3Var;
            c1403zf.f36037d = str;
            c1403zf.f36038e = yp1Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final s52 m12964d0(jl3 jl3Var) {
        return new s52(Math.round(jl3Var.f22396a), Math.round(jl3Var.f22397b), Math.round(jl3Var.f22398c), Math.round(jl3Var.f22399d));
    }

    /* JADX INFO: renamed from: e */
    public static final void m12965e(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-2143878029);
        if (ir1Var.m6871T(i & 1, i != 0)) {
            kf4.m7511a(null, null, 0L, 0L, 0.0f, dt0.f17352j, ir1Var, 12582912, 127);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            sg0 sg0Var = new sg0((byte) 14);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = sg0Var;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final nt2 m12966e0(nt2 nt2Var) {
        lg4 lg4Var = new lg4();
        lg4Var.f24027a = f34948z;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(lg4Var);
    }

    /* JADX INFO: renamed from: f */
    public static final void m12967f(C0800jj c0800jj, nt2 nt2Var, p91 p91Var, mc1 mc1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        p91 p91Var2;
        mc1 mc1Var2;
        pg0 pg0Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1663871913);
        int i2 = (ir1Var.m6890g(c0800jj) ? 4 : 2) | i | (ir1Var.m6890g(nt2Var) ? 32 : 16) | (ir1Var.m6890g(p91Var) ? 256 : 128) | (ir1Var.m6890g(mc1Var) ? 2048 : 1024);
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            nt2Var2 = nt2Var;
            p91Var2 = p91Var;
            mc1Var2 = mc1Var;
            pg0Var2 = pg0Var;
            z62.m13370b(c0800jj.f22324c, nt2Var2, p91Var2, mc1Var2, null, pg0Var2, ir1Var, (i2 & 8176) | 196608);
        } else {
            nt2Var2 = nt2Var;
            p91Var2 = p91Var;
            mc1Var2 = mc1Var;
            pg0Var2 = pg0Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ri1 ri1Var = new ri1(b);
            ri1Var.f29309c = c0800jj;
            ri1Var.f29310d = nt2Var2;
            ri1Var.f29311e = p91Var2;
            ri1Var.f29312f = mc1Var2;
            ri1Var.f29308b = pg0Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ri1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 mt2) = (r13v7 mt2), (r13v14 mt2) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    /* JADX INFO: renamed from: f0 */
    public static final boolean m12968f0(sl1 sl1Var, sl1 sl1Var2, int i, C1164t c1164t) {
        mt2 mt2Var;
        mt2 mt2Var2;
        wf2 wf2VarM10652X;
        C0940nb c0940nb;
        mt2 mt2VarM10644P;
        uw2 uw2Var;
        if (sl1Var.m10858T0() != nl1.f25928b) {
            C1077qn.m9989o("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new sl1[16];
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitChildren called on an unattached node");
        }
        uw2 uw2Var2 = new uw2(new mt2[16]);
        mt2 mt2Var3 = sl1Var.f25195a;
        mt2 mt2Var4 = mt2Var3.f25200f;
        if (mt2Var4 == null) {
            sc6.m10663e(uw2Var2, mt2Var3);
        } else {
            uw2Var2.m11663b(mt2Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = uw2Var2.f32213c;
            mt2Var = null;
            if (i3 == 0) {
                break;
            }
            mt2 mt2VarM10644P2 = (mt2) uw2Var2.m11672l(i3 - 1);
            if ((mt2VarM10644P2.f25198d & 1024) == 0) {
                sc6.m10663e(uw2Var2, mt2VarM10644P2);
            } else {
                while (mt2VarM10644P2 != null) {
                    if ((mt2VarM10644P2.f25197c & 1024) != 0) {
                        uw2 uw2Var3 = null;
                        while (mt2VarM10644P2 != null) {
                            if (mt2VarM10644P2 instanceof sl1) {
                                sl1 sl1Var3 = (sl1) mt2VarM10644P2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = sl1Var3;
                                i2 = i4;
                            } else if ((mt2VarM10644P2.f25197c & 1024) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                int i5 = 0;
                                for (mt2 mt2Var5 = ((qx0) mt2VarM10644P2).f28863p; mt2Var5 != null; mt2Var5 = mt2Var5.f25200f) {
                                    if ((mt2Var5.f25197c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            mt2VarM10644P2 = mt2Var5;
                                        } else {
                                            if (uw2Var3 == null) {
                                                uw2Var3 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P2 != null) {
                                                uw2Var3.m11663b(mt2VarM10644P2);
                                                mt2VarM10644P2 = null;
                                            }
                                            uw2Var3.m11663b(mt2Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            mt2VarM10644P2 = sc6.m10644P(uw2Var3);
                        }
                        break;
                    }
                    mt2VarM10644P2 = mt2VarM10644P2.f25200f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, vl1.f32715b);
        if (i != 1) {
            if (i != 2) {
                C1077qn.m9989o("This function should only be used for 1-D focus search");
                return false;
            }
            r52 r52VarM10660c0 = sc6.m10660c0(0, i2);
            int i6 = r52VarM10660c0.f27382a;
            int i7 = r52VarM10660c0.f27383b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        sl1 sl1Var4 = (sl1) objArr[i7];
                        if (zy5.m13851O(sl1Var4) && m12985o(sl1Var4, c1164t)) {
                            return true;
                        }
                    }
                    if (z62.m13387o(objArr[i7], sl1Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!sl1Var.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2Var2 = sl1Var.f25195a.f25199e;
                wf2VarM10652X = sc6.m10652X(sl1Var);
                loop5: while (wf2VarM10652X != null) {
                    if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                        while (mt2Var2 != null) {
                            if ((mt2Var2.f25197c & 1024) != 0) {
                                mt2VarM10644P = mt2Var2;
                                uw2Var = null;
                                while (mt2VarM10644P != null) {
                                    if (mt2VarM10644P instanceof sl1) {
                                        mt2Var = mt2VarM10644P;
                                        break loop5;
                                    }
                                    if ((mt2VarM10644P.f25197c & 1024) == 0) {
                                    }
                                    mt2VarM10644P = sc6.m10644P(uw2Var);
                                }
                            }
                            mt2Var2 = mt2Var2.f25199e;
                        }
                    }
                    wf2VarM10652X = wf2VarM10652X.m12295v();
                    if (wf2VarM10652X != null) {
                    }
                }
                if (mt2Var != null) {
                    return ((Boolean) c1164t.invoke(sl1Var)).booleanValue();
                }
            }
            return false;
        }
        r52 r52VarM10660c1 = sc6.m10660c0(0, i2);
        int i8 = r52VarM10660c1.f27382a;
        int i9 = r52VarM10660c1.f27383b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    sl1 sl1Var5 = (sl1) objArr[i8];
                    if (zy5.m13851O(sl1Var5) && m12937C(sl1Var5, c1164t)) {
                        return true;
                    }
                }
                if (z62.m13387o(objArr[i8], sl1Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && sl1Var.m10855Q0().f19067a) {
            if (!sl1Var.f25195a.f25208n) {
                q32.m9721c("visitAncestors called on an unattached node");
            }
            mt2Var2 = sl1Var.f25195a.f25199e;
            wf2VarM10652X = sc6.m10652X(sl1Var);
            loop5: while (wf2VarM10652X != null) {
                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                    while (mt2Var2 != null) {
                        if ((mt2Var2.f25197c & 1024) != 0) {
                            mt2VarM10644P = mt2Var2;
                            uw2Var = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof sl1) {
                                    mt2Var = mt2VarM10644P;
                                    break loop5;
                                }
                                if ((mt2VarM10644P.f25197c & 1024) == 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i10 = 0;
                                    for (mt2 mt2Var6 = ((qx0) mt2VarM10644P).f28863p; mt2Var6 != null; mt2Var6 = mt2Var6.f25200f) {
                                        if ((mt2Var6.f25197c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                mt2VarM10644P = mt2Var6;
                                            } else {
                                                if (uw2Var == null) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var.m11663b(mt2Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var);
                            }
                        }
                        mt2Var2 = mt2Var2.f25199e;
                    }
                }
                wf2VarM10652X = wf2VarM10652X.m12295v();
                mt2Var2 = (wf2VarM10652X != null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
            }
            if (mt2Var != null) {
                return ((Boolean) c1164t.invoke(sl1Var)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final as0 m12969g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new as0(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m12970g0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, gz0[] gz0VarArr) throws IOException {
        int i;
        int i2;
        int length;
        byte[] bArr2 = z62.f35787i;
        byte[] bArr3 = z62.f35786h;
        byte[] bArr4 = z62.f35783e;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = z62.f35784f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM12993w = m12993w(gz0VarArr, bArr5);
                d24.m4298M(byteArrayOutputStream, gz0VarArr.length, 1);
                d24.m4298M(byteArrayOutputStream, bArrM12993w.length, 4);
                byte[] bArrM4314o = d24.m4314o(bArrM12993w);
                d24.m4298M(byteArrayOutputStream, bArrM4314o.length, 4);
                byteArrayOutputStream.write(bArrM4314o);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                d24.m4298M(byteArrayOutputStream, gz0VarArr.length, 1);
                for (gz0 gz0Var : gz0VarArr) {
                    int size = gz0Var.f20210i.size() * 4;
                    String strM12939G = m12939G(bArr3, gz0Var.f20202a, gz0Var.f20203b);
                    Charset charset = StandardCharsets.UTF_8;
                    d24.m4299N(byteArrayOutputStream, strM12939G.getBytes(charset).length);
                    d24.m4299N(byteArrayOutputStream, gz0Var.f20209h.length);
                    d24.m4298M(byteArrayOutputStream, size, 4);
                    d24.m4298M(byteArrayOutputStream, gz0Var.f20204c, 4);
                    byteArrayOutputStream.write(strM12939G.getBytes(charset));
                    Iterator it = gz0Var.f20210i.keySet().iterator();
                    while (it.hasNext()) {
                        d24.m4299N(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        d24.m4299N(byteArrayOutputStream, 0);
                    }
                    for (int i4 : gz0Var.f20209h) {
                        d24.m4299N(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = z62.f35785g;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM12993w2 = m12993w(gz0VarArr, bArr6);
                d24.m4298M(byteArrayOutputStream, gz0VarArr.length, 1);
                d24.m4298M(byteArrayOutputStream, bArrM12993w2.length, 4);
                byte[] bArrM4314o2 = d24.m4314o(bArrM12993w2);
                d24.m4298M(byteArrayOutputStream, bArrM4314o2.length, 4);
                byteArrayOutputStream.write(bArrM4314o2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            d24.m4299N(byteArrayOutputStream, gz0VarArr.length);
            for (gz0 gz0Var2 : gz0VarArr) {
                String str = gz0Var2.f20202a;
                TreeMap treeMap = gz0Var2.f20210i;
                String strM12939G2 = m12939G(bArr2, str, gz0Var2.f20203b);
                Charset charset2 = StandardCharsets.UTF_8;
                d24.m4299N(byteArrayOutputStream, strM12939G2.getBytes(charset2).length);
                d24.m4299N(byteArrayOutputStream, treeMap.size());
                d24.m4299N(byteArrayOutputStream, gz0Var2.f20209h.length);
                d24.m4298M(byteArrayOutputStream, gz0Var2.f20204c, 4);
                byteArrayOutputStream.write(strM12939G2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    d24.m4299N(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : gz0Var2.f20209h) {
                    d24.m4299N(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            d24.m4299N(byteArrayOutputStream2, gz0VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (gz0 gz0Var3 : gz0VarArr) {
                d24.m4298M(byteArrayOutputStream2, gz0Var3.f20204c, 4);
                d24.m4298M(byteArrayOutputStream2, gz0Var3.f20205d, 4);
                d24.m4298M(byteArrayOutputStream2, gz0Var3.f20208g, 4);
                String strM12939G3 = m12939G(bArr4, gz0Var3.f20202a, gz0Var3.f20203b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM12939G3.getBytes(charset3).length;
                d24.m4299N(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strM12939G3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            s35 s35Var = new s35(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(s35Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < gz0VarArr.length) {
                try {
                    gz0 gz0Var4 = gz0VarArr[i8];
                    d24.m4299N(byteArrayOutputStream3, i8);
                    d24.m4299N(byteArrayOutputStream3, gz0Var4.f20206e);
                    i9 = i9 + 4 + (gz0Var4.f20206e * i6);
                    int[] iArr = gz0Var4.f20209h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        d24.m4299N(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            s35 s35Var2 = new s35(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(s35Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < gz0VarArr.length; i14++) {
                try {
                    gz0 gz0Var5 = gz0VarArr[i14];
                    Iterator it3 = gz0Var5.f20210i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m12986o0(byteArrayOutputStream5, iIntValue, gz0Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m12988p0(byteArrayOutputStream6, gz0Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            d24.m4299N(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            d24.m4298M(byteArrayOutputStream4, length4, 4);
                            d24.m4299N(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i15 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            s35 s35Var3 = new s35(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(s35Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            d24.m4298M(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                s35 s35Var4 = (s35) arrayList.get(i16);
                int i17 = s35Var4.f29858a;
                byte[] bArr7 = s35Var4.f29859b;
                if (i17 != 1) {
                    i = i12;
                    if (i17 == i) {
                        i2 = 1;
                    } else if (i17 == 3) {
                        i2 = i;
                    } else if (i17 == 4) {
                        i2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        i2 = 4;
                    }
                } else {
                    i = i12;
                    i2 = 0;
                }
                d24.m4298M(byteArrayOutputStream, i2, 4);
                d24.m4298M(byteArrayOutputStream, size2, 4);
                if (s35Var4.f29860c) {
                    long length5 = bArr7.length;
                    byte[] bArrM4314o3 = d24.m4314o(bArr7);
                    arrayList2.add(bArrM4314o3);
                    d24.m4298M(byteArrayOutputStream, bArrM4314o3.length, 4);
                    d24.m4298M(byteArrayOutputStream, length5, 4);
                    length = bArrM4314o3.length;
                } else {
                    arrayList2.add(bArr7);
                    d24.m4298M(byteArrayOutputStream, bArr7.length, 4);
                    d24.m4298M(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final s52 m12971h(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new s52(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m12972h0(iv2 iv2Var) {
        int i = iv2Var.f21821b;
        if (i == 0) {
            kx5.m7737u0("FloatList is empty.");
            throw null;
        }
        float f = iv2Var.f21820a[i - 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fM6945b = iv2Var.m6945b(i2);
            if (fM6945b < 0.0f || fM6945b >= 1.0f) {
                C1077qn.m9988n("FloatMapping - Progress outside of range: ".concat(iv2.m6943c(iv2Var, 31)));
                return;
            }
            if (m12951S(fM6945b, f) <= 1.0E-4f) {
                C1077qn.m9988n("FloatMapping - Progress repeats a value: ".concat(iv2.m6943c(iv2Var, 31)));
                return;
            } else if (fM6945b < f && (i3 = i3 + 1) > 1) {
                C1077qn.m9988n("FloatMapping - Progress wraps more than once: ".concat(iv2.m6943c(iv2Var, 31)));
                return;
            } else {
                i2++;
                f = fM6945b;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m12973i(boolean z, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-642000585);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6892h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            Object objM11585a = (cz2) ir1Var.m6898k(tm2.f31238a);
            if (objM11585a == null) {
                ir1Var.m6885d0(1512740606);
                objM11585a = um2.m11585a(ir1Var);
            } else {
                ir1Var.m6885d0(1512737723);
            }
            ir1Var.m6912r(false);
            if (objM11585a == null) {
                C1077qn.m9989o("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM6890g = ir1Var.m6890g(objM11585a);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            wm0 wm0Var = null;
            if (zM6890g || objM6869O == i50Var) {
                cz2 cz2Var = objM11585a instanceof cz2 ? (cz2) objM11585a : null;
                C1283w7 c1283w7Mo2974a = cz2Var != null ? cz2Var.mo2974a() : null;
                u33 u33Var = objM11585a instanceof u33 ? (u33) objM11585a : null;
                objM6869O = new C1345xv(c1283w7Mo2974a, u33Var != null ? u33Var.getOnBackPressedDispatcher() : null);
                ir1Var.m6905n0(objM6869O);
            }
            C1345xv c1345xv = (C1345xv) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var);
                ir1Var.m6905n0(objM6869O2);
            }
            zo0 zo0Var = (zo0) objM6869O2;
            long j = ir1Var.f21683T;
            boolean zM6890g2 = ir1Var.m6890g(c1345xv) | ir1Var.m6888f(j);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj = objM6869O3;
            if (zM6890g2 || objM6869O3 == i50Var) {
                qd3 qd3Var = new qd3();
                qd3Var.f28399a = objM11585a;
                qd3Var.f28400b = j;
                VarHandle.storeStoreFence();
                th0 th0Var = new th0(qd3Var);
                th0Var.f31160o = zo0Var;
                th0Var.f31161p = new C0872lh(i3, wm0Var, (byte) 3);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(th0Var);
                obj = th0Var;
            }
            th0 th0Var2 = (th0) obj;
            ir1Var.m6885d0(-348514256);
            boolean zM6894i = ir1Var.m6894i(th0Var2) | ir1Var.m6894i(mq1Var);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj2 = objM6869O4;
            if (zM6894i || objM6869O4 == i50Var) {
                jp1 jp1Var = new jp1((byte) 12);
                jp1Var.f22485b = th0Var2;
                jp1Var.f22486c = mq1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj2 = jp1Var;
            }
            lb5.m7914W(ir1Var, (wp1) obj2);
            int i4 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean zM6894i2 = (i5 == 4) | ir1Var.m6894i(th0Var2);
            Object objM6869O5 = ir1Var.m6869O();
            Object obj3 = objM6869O5;
            if (zM6894i2 || objM6869O5 == i50Var) {
                C1419zv c1419zv = new C1419zv((byte) 1);
                c1419zv.f36400c = th0Var2;
                c1419zv.f36399b = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1419zv);
                obj3 = c1419zv;
            }
            zc6.m13521f(boolValueOf, th0Var2, null, (yp1) obj3, ir1Var, i5);
            boolean zM6894i3 = ir1Var.m6894i(c1345xv) | ir1Var.m6894i(th0Var2);
            Object objM6869O6 = ir1Var.m6869O();
            Object obj4 = objM6869O6;
            if (zM6894i3 || objM6869O6 == i50Var) {
                na1 na1Var = new na1((byte) 20);
                na1Var.f25595b = c1345xv;
                na1Var.f25596c = th0Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj4 = na1Var;
            }
            lb5.m7924e(c1345xv, th0Var2, (yp1) obj4, ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rd3 rd3Var = new rd3();
            rd3Var.f29185a = z;
            rd3Var.f29186b = mq1Var;
            rd3Var.f29187c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rd3Var;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m12974i0(i14 i14Var, int i, yw3 yw3Var) {
        uw2 uw2Var = new uw2(new i14[16]);
        List listM6548i = i14Var.m6548i(false, false);
        while (true) {
            uw2Var.m11665d(listM6548i, uw2Var.f32213c);
            while (true) {
                int i2 = uw2Var.f32213c;
                if (i2 == 0) {
                    return;
                }
                i14 i14Var2 = (i14) uw2Var.m11672l(i2 - 1);
                boolean zM87y = C0006a5.m87y(i14Var2);
                e14 e14Var = i14Var2.f21012d;
                lw2 lw2Var = e14Var.f17631a;
                if (!zM87y && !lw2Var.m8128c(m14.f24561j)) {
                    e13 e13VarM6543d = i14Var2.m6543d();
                    if (e13VarM6543d == null) {
                        throw d55.m4363h("Expected semantics node to have a coordinator.");
                    }
                    s52 s52VarM12964d0 = m12964d0(y42.m12845Q(e13VarM6543d, true));
                    if (s52VarM12964d0.m10526b()) {
                        continue;
                    } else {
                        Object objM8132g = e14Var.f17631a.m8132g(d14.f16708e);
                        if (objM8132g == null) {
                            objM8132g = null;
                        }
                        mq1 mq1Var = (mq1) objM8132g;
                        Object objM8132g2 = lw2Var.m8132g(m14.f24574w);
                        ww3 ww3Var = (ww3) (objM8132g2 != null ? objM8132g2 : null);
                        if (mq1Var == null || ww3Var == null || ((Number) ww3Var.f33801b.invoke()).floatValue() <= 0.0f) {
                            listM6548i = i14Var2.m6548i(false, false);
                        } else {
                            int i3 = 1 + i;
                            zw3 zw3Var = new zw3();
                            zw3Var.f36428a = i14Var2;
                            zw3Var.f36429b = i3;
                            zw3Var.f36430c = s52VarM12964d0;
                            zw3Var.f36431d = e13VarM6543d;
                            VarHandle.storeStoreFence();
                            yw3Var.invoke(zw3Var);
                            m12974i0(i14Var2, i3, yw3Var);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m12975j(sg2 sg2Var, rn3 rn3Var, Object obj, nt2 nt2Var, boolean z, nt2 nt2Var2, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        int i3;
        nt2 nt2Var3;
        boolean z2;
        nt2 nt2Var4;
        nt2 nt2Var5;
        boolean z3;
        nt2 nt2VarM10693F;
        boolean z4;
        nt2 nt2Var6;
        nt2 nt2Var7;
        boolean z5;
        nt2 nt2VarM10693F2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(346306449);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(sg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(rn3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(obj) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            i4 = 93184 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= ir1Var.m6894i(pg0Var) ? 1048576 : 524288;
        }
        if ((599187 & i4) == 599186 && ir1Var.m6858D()) {
            ir1Var.m6874W();
            nt2Var6 = nt2Var;
            z4 = z;
            nt2Var7 = nt2Var2;
        } else {
            ir1Var.m6876Y();
            int i5 = i & 1;
            kt2 kt2Var = kt2.f23428a;
            if (i5 == 0 || ir1Var.m6856B()) {
                db4 db4VarM10014I = qq2.m10014I(0.0f, 400.0f, null, 5);
                Map map = wy4.f33864a;
                db4 db4VarM10014I2 = qq2.m10014I(0.0f, 400.0f, o52.m8954a(4294967297L), 1);
                db4 db4VarM10014I3 = qq2.m10014I(0.0f, 400.0f, null, 5);
                wg2 wg2Var = new wg2();
                wg2Var.f33365a = db4VarM10014I;
                wg2Var.f33366b = db4VarM10014I2;
                wg2Var.f33367c = db4VarM10014I3;
                VarHandle.storeStoreFence();
                i3 = i4 & (-458753);
                nt2Var3 = kt2Var;
                z2 = true;
                nt2Var4 = wg2Var;
            } else {
                ir1Var.m6874W();
                i3 = i4 & (-458753);
                nt2Var3 = nt2Var;
                z2 = z;
                nt2Var4 = nt2Var2;
            }
            ir1Var.m6913s();
            ir1Var.m6885d0(-1662944388);
            int i6 = i3 & 112;
            boolean z6 = i6 == 32;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (z6 || objM6869O == i50Var) {
                objM6869O = new gn3(rn3Var, (byte) 4);
                ir1Var.m6905n0(objM6869O);
            }
            ir1Var.m6912r(false);
            wy0 wy0VarM10566b = s94.m10566b((wp1) objM6869O);
            wy0 wy0VarM10566b2 = s94.m10566b(new dn3(obj, rn3Var, (byte) 1));
            if (((Boolean) wy0VarM10566b2.getValue()).booleanValue()) {
                ir1Var.m6885d0(-11550209);
                p45 p45Var = new p45();
                p45Var.f27377a = 1.0f;
                VarHandle.storeStoreFence();
                int iOrdinal = ((d63) wy0VarM10566b.getValue()).ordinal();
                if (iOrdinal == 0) {
                    ir1Var.m6885d0(-1662936154);
                    ir1Var.m6885d0(-1662935720);
                    boolean z7 = i6 == 32;
                    Object objM6869O2 = ir1Var.m6869O();
                    if (z7 || objM6869O2 == i50Var) {
                        z5 = false;
                        objM6869O2 = new on3(rn3Var, false ? 1 : 0);
                        ir1Var.m6905n0(objM6869O2);
                    } else {
                        z5 = false;
                    }
                    ir1Var.m6912r(z5);
                    nt2VarM10693F2 = se0.m10693F(kt2Var, (yp1) objM6869O2);
                    ir1Var.m6912r(z5);
                } else {
                    if (iOrdinal != 1) {
                        ir1Var.m6885d0(-1663429177);
                        ir1Var.m6912r(false);
                        C0670g.m5864c();
                        return;
                    }
                    ir1Var.m6885d0(-1662931418);
                    ir1Var.m6885d0(-1662930984);
                    boolean z8 = i6 == 32;
                    Object objM6869O3 = ir1Var.m6869O();
                    if (z8 || objM6869O3 == i50Var) {
                        objM6869O3 = new on3(rn3Var, (byte) 1);
                        ir1Var.m6905n0(objM6869O3);
                    }
                    ir1Var.m6912r(false);
                    nt2 nt2VarM10693F3 = se0.m10693F(kt2Var, (yp1) objM6869O3);
                    ir1Var.m6912r(false);
                    z5 = false;
                    nt2VarM10693F2 = nt2VarM10693F3;
                }
                nt2 nt2VarMo7630d = p45Var.mo7630d(nt2VarM10693F2);
                ir1Var.m6912r(z5);
                nt2Var5 = nt2VarMo7630d;
            } else if (obj.equals(rn3Var.f29458s.getValue())) {
                ir1Var.m6885d0(-11093021);
                p45 p45Var2 = new p45();
                p45Var2.f27377a = 1.0f;
                VarHandle.storeStoreFence();
                int iOrdinal2 = ((d63) wy0VarM10566b.getValue()).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        ir1Var.m6885d0(-1663429177);
                        ir1Var.m6912r(false);
                        C0670g.m5864c();
                        return;
                    }
                    ir1Var.m6885d0(-1662916236);
                    ir1Var.m6885d0(-1662915802);
                    boolean z9 = i6 == 32;
                    Object objM6869O4 = ir1Var.m6869O();
                    if (z9 || objM6869O4 == i50Var) {
                        objM6869O4 = new on3(rn3Var, (byte) 3);
                        ir1Var.m6905n0(objM6869O4);
                    }
                    z3 = false;
                    ir1Var.m6912r(false);
                    nt2VarM10693F = se0.m10693F(kt2Var, (yp1) objM6869O4);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(-1662921420);
                    ir1Var.m6885d0(-1662920986);
                    boolean z10 = i6 == 32;
                    Object objM6869O5 = ir1Var.m6869O();
                    if (z10 || objM6869O5 == i50Var) {
                        objM6869O5 = new on3(rn3Var, (byte) 2);
                        ir1Var.m6905n0(objM6869O5);
                    }
                    z3 = false;
                    ir1Var.m6912r(false);
                    nt2VarM10693F = se0.m10693F(kt2Var, (yp1) objM6869O5);
                    ir1Var.m6912r(false);
                }
                nt2 nt2VarMo7630d2 = p45Var2.mo7630d(nt2VarM10693F);
                ir1Var.m6912r(z3);
                nt2Var5 = nt2VarMo7630d2;
            } else {
                ir1Var.m6885d0(-10663144);
                ir1Var.m6912r(false);
                nt2Var5 = nt2Var4;
            }
            y42.m12832I(rn3Var, obj, nt2Var3.mo7630d(nt2Var5), z2, ((Boolean) wy0VarM10566b2.getValue()).booleanValue(), pg0Var, ir1Var, 466046 & (i3 >> 3));
            z4 = z2;
            nt2Var6 = nt2Var3;
            nt2Var7 = nt2Var4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new nn3(sg2Var, rn3Var, obj, nt2Var6, z4, nt2Var7, pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static nr6 m12976j0(List list) {
        if (list == null || list.isEmpty()) {
            return m12936B(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((nr6) it.next()) == null) {
                xy4.m12782k("null tasks are not accepted");
                return null;
            }
        }
        nr6 nr6Var = new nr6();
        int size = list.size();
        eo5 eo5Var = new eo5();
        eo5Var.f18336a = new Object();
        eo5Var.f18337b = size;
        eo5Var.f18338c = nr6Var;
        VarHandle.storeStoreFence();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            nr6 nr6Var2 = (nr6) it2.next();
            sz0 sz0Var = mi4.f24959b;
            nr6Var2.m8820d(sz0Var, eo5Var);
            nr6Var2.m8819c(sz0Var, eo5Var);
            nr6Var2.m8817a(sz0Var, eo5Var);
        }
        return nr6Var;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12977k() {
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    /* JADX INFO: renamed from: k0 */
    public static nr6 m12978k0(nr6... nr6VarArr) {
        if (nr6VarArr.length == 0) {
            return m12936B(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(nr6VarArr);
        bu3 bu3Var = mi4.f24958a;
        if (listAsList == null || listAsList.isEmpty()) {
            return m12936B(Collections.EMPTY_LIST);
        }
        List list = listAsList;
        nr6 nr6VarM12976j0 = m12976j0(list);
        bt5 bt5Var = new bt5((byte) 18);
        bt5Var.f15596b = list;
        VarHandle.storeStoreFence();
        return nr6VarM12976j0.m8822f(bu3Var, bt5Var);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12979l(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (!"omid-native".equals(uri.getScheme())) {
                return false;
            }
            sc6.m10661d(uri);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final nt2 m12980l0(nt2 nt2Var) {
        u62 u62Var = u62.f31673b;
        v62 v62Var = new v62();
        v62Var.f32428a = u62Var;
        v62Var.f32429b = true;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(v62Var);
    }

    /* JADX INFO: renamed from: m */
    public static Object m12981m(nr6 nr6Var) throws InterruptedException {
        y42.m12853Z("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C1077qn.m9989o("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        if (nr6Var.m8825i()) {
            return m12990q0(nr6Var);
        }
        w42 w42Var = new w42((byte) 27);
        Executor executor = mi4.f24959b;
        nr6Var.m8820d(executor, w42Var);
        nr6Var.m8819c(executor, w42Var);
        nr6Var.m8817a(executor, w42Var);
        ((CountDownLatch) w42Var.f33090b).await();
        return m12990q0(nr6Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m12982m0(ByteArrayOutputStream byteArrayOutputStream, gz0 gz0Var) throws IOException {
        m12988p0(byteArrayOutputStream, gz0Var);
        int i = gz0Var.f20208g;
        int[] iArr = gz0Var.f20209h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            d24.m4299N(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : gz0Var.f20210i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: n */
    public static Object m12983n(nr6 nr6Var, long j) throws TimeoutException {
        y42.m12853Z("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C1077qn.m9989o("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        y42.m12855b0(nr6Var, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y42.m12855b0(timeUnit, "TimeUnit must not be null");
        if (nr6Var.m8825i()) {
            return m12990q0(nr6Var);
        }
        w42 w42Var = new w42((byte) 27);
        Executor executor = mi4.f24959b;
        nr6Var.m8820d(executor, w42Var);
        nr6Var.m8819c(executor, w42Var);
        nr6Var.m8817a(executor, w42Var);
        if (((CountDownLatch) w42Var.f33090b).await(j, timeUnit)) {
            return m12990q0(nr6Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: n0 */
    public static void m12984n0(ByteArrayOutputStream byteArrayOutputStream, gz0 gz0Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        d24.m4299N(byteArrayOutputStream, str.getBytes(charset).length);
        d24.m4299N(byteArrayOutputStream, gz0Var.f20206e);
        d24.m4298M(byteArrayOutputStream, gz0Var.f20207f, 4);
        d24.m4298M(byteArrayOutputStream, gz0Var.f20204c, 4);
        d24.m4298M(byteArrayOutputStream, gz0Var.f20208g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    /* JADX INFO: renamed from: o */
    public static final boolean m12985o(sl1 sl1Var, C1164t c1164t) {
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sl1 sl1VarM13847K = zy5.m13847K(sl1Var);
                if (sl1VarM13847K == null) {
                    C1077qn.m9989o("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = sl1VarM13847K.m10858T0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (m12985o(sl1VarM13847K, c1164t) || m12938F(sl1Var, sl1VarM13847K, 2, c1164t) || (sl1VarM13847K.m10855Q0().f19067a && ((Boolean) c1164t.invoke(sl1VarM13847K)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C0670g.m5864c();
                            return false;
                        }
                        C1077qn.m9989o("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return m12938F(sl1Var, sl1VarM13847K, 2, c1164t);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C0670g.m5864c();
                    return false;
                }
                if (!m12948P(sl1Var, c1164t)) {
                    if (!(sl1Var.m10855Q0().f19067a ? ((Boolean) c1164t.invoke(sl1Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m12948P(sl1Var, c1164t);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m12986o0(ByteArrayOutputStream byteArrayOutputStream, int i, gz0 gz0Var) throws IOException {
        int i2 = gz0Var.f20208g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : gz0Var.f20210i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static final int m12987p(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m12988p0(ByteArrayOutputStream byteArrayOutputStream, gz0 gz0Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : gz0Var.f20210i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                d24.m4299N(byteArrayOutputStream, iIntValue - i);
                d24.m4299N(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final int m12989q(so2 so2Var, AbstractC0568da abstractC0568da) {
        so2 so2VarMo4896z0 = so2Var.mo4896z0();
        if (so2VarMo4896z0 == null) {
            q32.m9721c("Child of " + so2Var + " cannot be null when calculating alignment line");
        }
        if (so2Var.mo4855F0().mo4502a().containsKey(abstractC0568da)) {
            Integer num = (Integer) so2Var.mo4855F0().mo4502a().get(abstractC0568da);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iMo4419e0 = so2VarMo4896z0.mo4419e0(abstractC0568da);
            if (iMo4419e0 != Integer.MIN_VALUE) {
                boolean z = so2Var.f30440n;
                boolean z2 = so2Var.f30441o;
                so2VarMo4896z0.f30440n = true;
                so2Var.f30441o = true;
                so2Var.mo4858L0();
                so2VarMo4896z0.f30440n = z;
                so2Var.f30441o = z2;
                return iMo4419e0 + ((int) (abstractC0568da instanceof dx1 ? so2VarMo4896z0.mo4857H0() & 4294967295L : so2VarMo4896z0.mo4857H0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m12990q0(nr6 nr6Var) throws ExecutionException {
        if (nr6Var.m8826j()) {
            return nr6Var.m8824h();
        }
        if (nr6Var.f26060d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(nr6Var.m8823g());
    }

    /* JADX INFO: renamed from: r */
    public static nr6 m12991r(Callable callable, Executor executor) {
        y42.m12855b0(executor, "Executor must not be null");
        nr6 nr6Var = new nr6();
        dq6 dq6Var = new dq6((byte) 1);
        dq6Var.f17289b = nr6Var;
        dq6Var.f17290c = callable;
        VarHandle.storeStoreFence();
        executor.execute(dq6Var);
        return nr6Var;
    }

    /* JADX INFO: renamed from: v */
    public static void m12992v(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM3883o = c75.m3883o("radix ", i, " was not in valid range ");
            sbM3883o.append(new r52(2, 36, 1));
            throw new IllegalArgumentException(sbM3883o.toString());
        }
    }

    /* JADX INFO: renamed from: w */
    public static byte[] m12993w(gz0[] gz0VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (gz0 gz0Var : gz0VarArr) {
            length += ((((gz0Var.f20208g * 2) + 7) & (-8)) / 8) + (gz0Var.f20206e * 2) + m12939G(bArr, gz0Var.f20202a, gz0Var.f20203b).getBytes(StandardCharsets.UTF_8).length + 16 + gz0Var.f20207f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, z62.f35785g)) {
            int length2 = gz0VarArr.length;
            while (i < length2) {
                gz0 gz0Var2 = gz0VarArr[i];
                m12984n0(byteArrayOutputStream, gz0Var2, m12939G(bArr, gz0Var2.f20202a, gz0Var2.f20203b));
                m12982m0(byteArrayOutputStream, gz0Var2);
                i++;
            }
        } else {
            for (gz0 gz0Var3 : gz0VarArr) {
                m12984n0(byteArrayOutputStream, gz0Var3, m12939G(bArr, gz0Var3.f20202a, gz0Var3.f20203b));
            }
            int length3 = gz0VarArr.length;
            while (i < length3) {
                m12982m0(byteArrayOutputStream, gz0VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m12994x(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: y */
    public static int m12995y(HandwritingGesture handwritingGesture, b71 b71Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        b71Var.invoke(new xd0(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: z */
    public static InvocationHandler m12996z() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    /* JADX INFO: renamed from: D */
    public C0002a1 mo3394D(AbstractC0782j1 abstractC0782j1) {
        C0002a1 c0002a1;
        C0002a1 c0002a2 = C0002a1.f28d;
        synchronized (abstractC0782j1) {
            try {
                c0002a1 = abstractC0782j1.f21943b;
                if (c0002a1 != c0002a2) {
                    abstractC0782j1.f21943b = c0002a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0002a1;
    }

    /* JADX INFO: renamed from: E */
    public C0746i1 mo3395E(AbstractC0782j1 abstractC0782j1) {
        C0746i1 c0746i1;
        C0746i1 c0746i2 = C0746i1.f20994c;
        synchronized (abstractC0782j1) {
            try {
                c0746i1 = abstractC0782j1.f21944c;
                if (c0746i1 != c0746i2) {
                    abstractC0782j1.f21944c = c0746i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0746i1;
    }

    /* JADX INFO: renamed from: T */
    public void mo3396T(C0746i1 c0746i1, C0746i1 c0746i2) {
        c0746i1.f20996b = c0746i2;
    }

    /* JADX INFO: renamed from: U */
    public void mo3397U(C0746i1 c0746i1, Thread thread) {
        c0746i1.f20995a = thread;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo3398s(AbstractC0782j1 abstractC0782j1, C0002a1 c0002a1, C0002a1 c0002a2) {
        synchronized (abstractC0782j1) {
            try {
                if (abstractC0782j1.f21943b != c0002a1) {
                    return false;
                }
                abstractC0782j1.f21943b = c0002a2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean mo3399t(AbstractC0782j1 abstractC0782j1, Object obj, Object obj2) {
        synchronized (abstractC0782j1) {
            try {
                if (abstractC0782j1.f21942a != obj) {
                    return false;
                }
                abstractC0782j1.f21942a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean mo3400u(AbstractC0782j1 abstractC0782j1, C0746i1 c0746i1, C0746i1 c0746i2) {
        synchronized (abstractC0782j1) {
            try {
                if (abstractC0782j1.f21944c != c0746i1) {
                    return false;
                }
                abstractC0782j1.f21944c = c0746i2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
