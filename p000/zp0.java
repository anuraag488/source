package p000;

import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.kx2;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.v52;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.xa3;
import ads_mobile_sdk.z52;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zp0 {

    /* JADX INFO: renamed from: a */
    public static final C0891m f36238a = new C0891m(22);

    /* JADX INFO: renamed from: b */
    public static final pg0 f36239b = new pg0(486633673, false, new fh0(17));

    /* JADX INFO: renamed from: c */
    public static final pg0 f36240c = new pg0(-460889049, false, new jh0(5));

    /* JADX INFO: renamed from: d */
    public static final pg0 f36241d = new pg0(-2025595922, false, new xg0(28));

    /* JADX INFO: renamed from: e */
    public static final pg0 f36242e = new pg0(711299801, false, new jh0(6));

    /* JADX INFO: renamed from: f */
    public static final jc2[] f36243f = new jc2[0];

    /* JADX INFO: renamed from: g */
    public static final ro4 f36244g = new ro4(1);

    /* JADX INFO: renamed from: h */
    public static final z45 f36245h = new z45(28);

    /* JADX INFO: renamed from: i */
    public static g12 f36246i;

    /* JADX INFO: renamed from: A */
    public static final float m13650A(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: B */
    public static void m13651B(String str, String str2, ir1 ir1Var, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodM13692x = m13692x(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodM13692x != null) {
                methodM13692x.setAccessible(true);
                if (Modifier.isStatic(methodM13692x.getModifiers())) {
                    m13652C(methodM13692x, null, ir1Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    m13652C(methodM13692x, cls.getConstructor(null).newInstance(null), ir1Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + "." + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", zi4.m13622v("Failed to invoke Composable Method '", str, ".", str2, "'"), null);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX INFO: renamed from: C */
    public static void m13652C(Method method, Object obj, ir1 ir1Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (z62.m13387o(parameterTypes[length], mi0.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int iCeil = (i != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i)) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i) / 31.0d) : 0) + iCeil != length2) {
            C1077qn.m9989o("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    objValueOf = ir1Var;
                } else if (i3 <= i4 && i4 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i4 || i4 >= length2) {
                        C1077qn.m9989o("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                switch (method.getParameterTypes()[i4].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i4];
            }
            objArr2[i4] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m13653D(zo0 zo0Var) {
        t82 t82Var = (t82) zo0Var.mo6367f().get(o85.f26448h);
        if (t82Var != null) {
            return t82Var.mo4995b();
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m13654E(long j) {
        return (j & 2) != 0;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m13655F(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public static final float m13656G(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: I */
    public static String m13657I(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int length = encoded.length;
        dt0.m4719u(encoded.length, 0L, length);
        zt5.m13785p(length, encoded.length);
        int i = 0;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, length);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        byte[] bArrDigest = messageDigest.digest();
        byte[] bArr = AbstractC0000a.f0a;
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b = bArrDigest[i];
            int i3 = i + 2;
            byte b2 = bArrDigest[i + 1];
            i += 3;
            byte b3 = bArrDigest[i3];
            bArr2[i2] = bArr[(b & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b3 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b4 = bArrDigest[i];
            bArr2[i2] = bArr[(b4 & 255) >> 2];
            bArr2[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b5 = bArrDigest[i];
            byte b6 = bArrDigest[i5];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, z80.f35863a));
        return sb.toString();
    }

    /* JADX INFO: renamed from: J */
    public static final C0651fh m13658J(wp1 wp1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
        boolean zM6890g = ir1Var.m6890g(view);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (zM6890g || objM6869O == i50Var) {
            C0651fh c0651fh = new C0651fh();
            c0651fh.f18971a = view;
            c0651fh.f18972b = null;
            c0651fh.f18973c = wp1Var;
            c0651fh.f18974d = new dx2();
            C1404zg c1404zg = new C1404zg((byte) 0);
            c1404zg.f36057b = c0651fh;
            VarHandle.storeStoreFence();
            c0651fh.f18975e = new aa4(c1404zg);
            C1404zg c1404zg2 = new C1404zg((byte) 1);
            c1404zg2.f36057b = c0651fh;
            VarHandle.storeStoreFence();
            c0651fh.f18976f = c1404zg2;
            C1404zg c1404zg3 = new C1404zg((byte) 2);
            c1404zg3.f36057b = c0651fh;
            VarHandle.storeStoreFence();
            c0651fh.f18977g = c1404zg3;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0651fh);
            obj = c0651fh;
        }
        C0651fh c0651fh2 = (C0651fh) obj;
        boolean zM6894i = ir1Var.m6894i(c0651fh2);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            C1404zg c1404zg4 = new C1404zg((byte) 3);
            c1404zg4.f36057b = c0651fh2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c1404zg4);
            obj2 = c1404zg4;
        }
        lb5.m7923d(c0651fh2, (yp1) obj2, ir1Var);
        return c0651fh2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:183:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:192:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ef A[LOOP:5: B:196:0x03ed->B:197:0x03ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0431  */
    /* JADX WARN: Code duplicated, block: B:208:0x0438  */
    /* JADX WARN: Code duplicated, block: B:210:0x0441  */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x03ef, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    /* JADX INFO: renamed from: K */
    public static final void m13659K(ViewStructure viewStructure, wf2 wf2Var, AutofillId autofillId, String str, ll3 ll3Var) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        C0875lk c0875lk;
        C1401zd c1401zd;
        ln4 ln4Var;
        lq3 lq3Var;
        bm0 bm0Var;
        boolean z;
        mm0 mm0Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        String strM13861Y;
        int size;
        String str2;
        int i;
        String[] strArr;
        String[] strArr2;
        Object[] objArr;
        int i2;
        int i3;
        Object[] objArr2;
        boolean z6;
        ln4 ln4Var2;
        C0875lk c0875lk2;
        C1401zd c1401zd2;
        lq3 lq3Var2;
        boolean z7;
        p14 p14Var = m14.f24552a;
        p14 p14Var2 = d14.f16704a;
        e14 e14VarM12297x = wf2Var.m12297x();
        int i4 = 8;
        boolean z8 = true;
        if (e14VarM12297x != null) {
            lw2 lw2Var = e14VarM12297x.f17631a;
            j = 128;
            Object[] objArr3 = lw2Var.f24419b;
            Object[] objArr4 = lw2Var.f24420c;
            long[] jArr = lw2Var.f24418a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                bm0Var = null;
                z = false;
                ln4Var2 = null;
                c0875lk2 = null;
                c1401zd2 = null;
                mm0Var = null;
                bool = null;
                lq3Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr3[i8];
                                Object obj3 = objArr4[i8];
                                p14 p14Var3 = (p14) obj2;
                                if (z62.m13387o(p14Var3, m14.f24570s)) {
                                    bm0Var = (bm0) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24552a)) {
                                    String str3 = (String) hb0.m6301M0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (z62.m13387o(p14Var3, m14.f24569r)) {
                                    mm0Var = (mm0) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24571t)) {
                                    c1401zd2 = (C1401zd) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24539F)) {
                                    c0875lk2 = (C0875lk) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24563l)) {
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (z62.m13387o(p14Var3, m14.f24550Q)) {
                                    num = (Integer) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24546M)) {
                                    z2 = z8;
                                } else if (z62.m13387o(p14Var3, m14.f24566o)) {
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (z62.m13387o(p14Var3, m14.f24576y)) {
                                    lq3Var2 = (lq3) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24543J)) {
                                    bool = (Boolean) obj3;
                                } else if (z62.m13387o(p14Var3, m14.f24544K)) {
                                    ln4Var2 = (ln4) obj3;
                                } else if (z62.m13387o(p14Var3, d14.f16705b)) {
                                    viewStructure.setClickable(z8);
                                } else if (z62.m13387o(p14Var3, d14.f16706c)) {
                                    viewStructure.setLongClickable(z8);
                                } else if (z62.m13387o(p14Var3, d14.f16726w)) {
                                    viewStructure.setFocusable(z8);
                                } else if (z62.m13387o(p14Var3, d14.f16714k)) {
                                    z = z8;
                                }
                                z7 = z8;
                                if (Build.VERSION.SDK_INT >= 34 && z62.m13387o(p14Var3, C0638f5.f18757k)) {
                                    obj = obj3;
                                }
                            } else {
                                z7 = z8;
                            }
                            j4 >>= 8;
                            i7++;
                            z8 = z7;
                        }
                        z6 = z8;
                        z6 = z6;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        z6 = z8 ? 1 : 0;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    z8 = z6 ? 1 : 0;
                }
            } else {
                z6 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                bm0Var = null;
                z = false;
                ln4Var2 = null;
                c0875lk2 = null;
                c1401zd2 = null;
                mm0Var = null;
                bool = null;
                lq3Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            ln4Var = ln4Var2;
            c0875lk = c0875lk2;
            c1401zd = c1401zd2;
            lq3Var = lq3Var2;
            r38 = z6;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            c0875lk = null;
            c1401zd = null;
            ln4Var = null;
            lq3Var = null;
            bm0Var = null;
            z = false;
            mm0Var = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        e14 e14VarM12297x2 = wf2Var.m12297x();
        if (e14VarM12297x2 != null && e14VarM12297x2.f17633c && !e14VarM12297x2.f17634d) {
            e14VarM12297x2 = e14VarM12297x2.m4899b();
            cw2 cw2Var = new cw2(((uw2) ((aw2) wf2Var.m12288o()).f14915b).f32213c);
            cw2Var.m4202c(wf2Var.m12288o());
            while (cw2Var.m4209j()) {
                wf2 wf2Var2 = (wf2) cw2Var.m4211l(cw2Var.f16533b - 1);
                e14 e14VarM12297x3 = wf2Var2.m12297x();
                if (e14VarM12297x3 != null && !e14VarM12297x3.f17633c) {
                    e14VarM12297x2.m4901d(e14VarM12297x3);
                    if (!e14VarM12297x3.f17634d) {
                        cw2Var.m4202c(wf2Var2.m12288o());
                    }
                }
            }
        }
        if (e14VarM12297x2 != null) {
            lw2 lw2Var2 = e14VarM12297x2.f17631a;
            Object[] objArr5 = lw2Var2.f24419b;
            Object[] objArr6 = lw2Var2.f24420c;
            long[] jArr2 = lw2Var2.f24418a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i9];
                    int i10 = i4;
                    List list2 = list;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i11 = 8 - ((~(i9 - length2)) >>> 31);
                        list = list2;
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i9 << 3) + i12;
                                Object obj4 = objArr5[i13];
                                Object obj5 = objArr6[i13];
                                i3 = i12;
                                p14 p14Var4 = (p14) obj4;
                                objArr2 = objArr5;
                                if (z62.m13387o(p14Var4, m14.f24561j)) {
                                    viewStructure.setEnabled(false);
                                } else if (z62.m13387o(p14Var4, m14.f24535B)) {
                                    list = (List) obj5;
                                }
                            } else {
                                i3 = i12;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i12 = i3 + 1;
                            objArr5 = objArr2;
                        }
                        objArr = objArr5;
                        i2 = i10;
                        if (i11 != i2) {
                            break;
                        }
                    } else {
                        objArr = objArr5;
                        i2 = i10;
                        list = list2;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    i4 = i2;
                    jArr2 = jArr2;
                    objArr5 = objArr;
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(wf2Var.f33312b);
        if (wf2Var.m12295v() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (bm0Var != null) {
            numValueOf = Integer.valueOf(((C0794jd) bm0Var).f22170b);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = ln4Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (c0875lk != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(zc6.m13513J(c0875lk.f24092b)));
        }
        if (c1401zd != null) {
            viewStructure.setAutofillValue(c1401zd.f35993a);
        }
        if (mm0Var != null && (strArr2 = (String[]) ((C0831kd) mm0Var).f23070b.toArray(new String[0])) != null) {
            viewStructure.setAutofillHints(strArr2);
        }
        wf2 wf2Var3 = (wf2) ll3Var.f24126a.m8197b(wf2Var.f33312b);
        if (wf2Var3 != null && wf2Var3.f33317g != -4) {
            C0795je c0795je = ll3Var.f24128c;
            int iM8029d = ll3Var.m8029d(wf2Var3);
            long[] jArr3 = (long[]) c0795je.f22194c;
            long j6 = jArr3[iM8029d];
            long j7 = jArr3[iM8029d + 1];
            int i14 = (int) (j6 >> 32);
            int i15 = (int) j6;
            viewStructure.setDimens(i14, i15, 0, 0, ((int) (j7 >> 32)) - i14, ((int) j7) - i15);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (ln4Var != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(ln4Var == ln4.f24214a);
        } else if (bool != null && (lq3Var == null || lq3Var.f24281a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        mm0.f25019a.getClass();
        String[] strArr3 = (String[]) lm0.f24149b.f23070b.toArray(new String[0]);
        if (strArr3.length == 0) {
            ds3.m4667k("Array is empty.");
            return;
        }
        String str4 = strArr3[0];
        if (mm0Var != null && (strArr = (String[]) ((C0831kd) mm0Var).f23070b.toArray(new String[0])) != null) {
            boolean zM9195P = AbstractC0990oo.m9195P(str4, strArr);
            z3 = true;
            boolean z9 = zM9195P;
            if (!z2 || z9) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (!z4 || zBooleanValue) {
                z5 = z3;
            } else {
                z5 = false;
            }
            viewStructure.setDataIsSensitive(z5);
            viewStructure.setVisibility(((e13) wf2Var.f33299G.f25608e).m4880i1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i = 0; i < size; i++) {
                    str2 = ((Object) str2) + ((C0875lk) list.get(i)).f24092b + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((aw2) wf2Var.m12288o()).isEmpty() && lq3Var != null && (strM13861Y = zy5.m13861Y(lq3Var.f24281a)) != null) {
                viewStructure.setClassName(strM13861Y);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z4) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            xy4.m12778e();
            return;
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        viewStructure.setDataIsSensitive(z5);
        viewStructure.setVisibility(((e13) wf2Var.f33299G.f25608e).m4880i1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i < size) {
                str2 = ((Object) str2) + ((C0875lk) list.get(i)).f24092b + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((aw2) wf2Var.m12288o()).isEmpty()) {
            viewStructure.setClassName(strM13861Y);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (z4) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX INFO: renamed from: L */
    public static final List m13660L(gf4 gf4Var) {
        int iM13535u = zc6.m13535u(gf4Var, "id");
        int iM13535u2 = zc6.m13535u(gf4Var, "seq");
        int iM13535u3 = zc6.m13535u(gf4Var, "from");
        int iM13535u4 = zc6.m13535u(gf4Var, "to");
        sl2 sl2VarM7680G = kx5.m7680G();
        while (gf4Var.mo5112g()) {
            int i = (int) gf4Var.getLong(iM13535u);
            int i2 = (int) gf4Var.getLong(iM13535u2);
            String strMo5110b = gf4Var.mo5110b(iM13535u3);
            String strMo5110b2 = gf4Var.mo5110b(iM13535u4);
            en1 en1Var = new en1();
            en1Var.f18268a = i;
            en1Var.f18269b = i2;
            en1Var.f18270c = strMo5110b;
            en1Var.f18271d = strMo5110b2;
            VarHandle.storeStoreFence();
            sl2VarM7680G.add(en1Var);
        }
        return hb0.m6314Z0(kx5.m7740w(sl2VarM7680G));
    }

    /* JADX INFO: renamed from: M */
    public static final sh4 m13661M(ve4 ve4Var, String str, boolean z) {
        gf4 gf4VarM11888b = ve4Var.m11888b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM13535u = zc6.m13535u(gf4VarM11888b, "seqno");
            int iM13535u2 = zc6.m13535u(gf4VarM11888b, "cid");
            int iM13535u3 = zc6.m13535u(gf4VarM11888b, "name");
            int iM13535u4 = zc6.m13535u(gf4VarM11888b, "desc");
            if (iM13535u != -1 && iM13535u2 != -1 && iM13535u3 != -1 && iM13535u4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (gf4VarM11888b.mo5112g()) {
                    if (((int) gf4VarM11888b.getLong(iM13535u2)) >= 0) {
                        int i = (int) gf4VarM11888b.getLong(iM13535u);
                        String strMo5110b = gf4VarM11888b.mo5110b(iM13535u3);
                        String str2 = gf4VarM11888b.getLong(iM13535u4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strMo5110b);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM6315a1 = hb0.m6315a1(linkedHashMap.entrySet(), new vl1((byte) 16));
                ArrayList arrayList = new ArrayList(ib0.m6717y0(listM6315a1, 10));
                Iterator it = listM6315a1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM6319e1 = hb0.m6319e1(arrayList);
                List listM6315a2 = hb0.m6315a1(linkedHashMap2.entrySet(), new vl1((byte) 17));
                ArrayList arrayList2 = new ArrayList(ib0.m6717y0(listM6315a2, 10));
                Iterator it2 = listM6315a2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                sh4 sh4Var = new sh4(str, z, listM6319e1, hb0.m6319e1(arrayList2));
                sc6.m10672m(gf4VarM11888b, null);
                return sh4Var;
            }
            sc6.m10672m(gf4VarM11888b, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc6.m10672m(gf4VarM11888b, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static final kz2 m13662N(aw3 aw3Var, mi0 mi0Var) {
        xv3 xv3Var = new xv3(aw3Var.f14918c);
        ArrayList arrayList = aw3Var.f14919d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new xv3((wv3) arrayList.get(i)));
        }
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        v71 v71Var = v71.f32439a;
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (objM6869O == i50Var) {
            kz2 kz2Var = new kz2();
            kz2Var.f23632a = k43.m7398w(lz2.f24483a);
            kz2Var.f23633b = k43.m7398w(arrayList2);
            kz2Var.f23634c = k43.m7398w(xv3Var);
            kz2Var.f23635d = k43.m7398w(v71Var);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(kz2Var);
            obj = kz2Var;
        }
        kz2 kz2Var2 = (kz2) obj;
        boolean zM6894i = ir1Var.m6894i(xv3Var) | ir1Var.m6894i(arrayList2) | ir1Var.m6894i(v71Var);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            C0590dx c0590dx = new C0590dx((byte) 5);
            c0590dx.f17475e = kz2Var2;
            c0590dx.f17472b = xv3Var;
            c0590dx.f17473c = arrayList2;
            c0590dx.f17474d = v71Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0590dx);
            obj2 = c0590dx;
        }
        lb5.m7914W(ir1Var, (wp1) obj2);
        return kz2Var2;
    }

    /* JADX INFO: renamed from: O */
    public static final dp4 m13663O(zh0 zh0Var, String str, mi0 mi0Var, int i, int i2) {
        wm0 wm0Var = null;
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = (i & 14) ^ 6;
        byte b = 1;
        boolean z = (i3 > 4 && ((ir1) mi0Var).m6890g(zh0Var)) || (i & 6) == 4;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        Object obj = ki0.f23136a;
        if (z || objM6869O == obj) {
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                Object dp4Var = new dp4(zh0Var, null, str);
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                ir1Var.m6905n0(dp4Var);
                objM6869O = dp4Var;
            } catch (Throwable th) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th;
            }
        }
        dp4 dp4Var2 = (dp4) objM6869O;
        if (zh0Var instanceof yz3) {
            ir1Var.m6885d0(-1357398105);
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == obj) {
                objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var);
                ir1Var.m6905n0(objM6869O2);
            }
            Object obj2 = (zo0) objM6869O2;
            boolean zM6894i = ir1Var.m6894i(obj2) | ((i3 > 4 && ir1Var.m6890g(zh0Var)) || (i & 6) == 4);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj3 = objM6869O3;
            if (zM6894i || objM6869O3 == obj) {
                cz3 cz3Var = new cz3((byte) 18);
                cz3Var.f16638b = zh0Var;
                cz3Var.f16639c = obj2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var);
                obj3 = cz3Var;
            }
            lb5.m7923d(obj2, (yp1) obj3, ir1Var);
            yz3 yz3Var = (yz3) zh0Var;
            Object value = yz3Var.f35652g.getValue();
            Object value2 = yz3Var.f35651f.getValue();
            boolean z2 = (i3 > 4 && ir1Var.m6890g(zh0Var)) || (i & 6) == 4;
            Object objM6869O4 = ir1Var.m6869O();
            if (z2 || objM6869O4 == obj) {
                objM6869O4 = new er2((Object) zh0Var, wm0Var, (byte) 15);
                ir1Var.m6905n0(objM6869O4);
            }
            lb5.m7927h(value, value2, (mq1) objM6869O4, ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1356407283);
            dp4Var2.m4639a(zh0Var.mo11189m(), ir1Var, 0);
            ir1Var.m6912r(false);
        }
        boolean zM6890g = ir1Var.m6890g(dp4Var2);
        Object objM6869O5 = ir1Var.m6869O();
        Object obj4 = objM6869O5;
        if (zM6890g || objM6869O5 == obj) {
            ep4 ep4Var = new ep4(b);
            ep4Var.f18357b = dp4Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(ep4Var);
            obj4 = ep4Var;
        }
        lb5.m7923d(dp4Var2, (yp1) obj4, ir1Var);
        return dp4Var2;
    }

    /* JADX INFO: renamed from: P */
    public static final gy4 m13664P(wf2 wf2Var) {
        gy4 gy4Var = wf2Var.f33326p;
        if (gy4Var != null) {
            return gy4Var;
        }
        throw d55.m4363h("Required value was null.");
    }

    /* JADX INFO: renamed from: Q */
    public static final Object m13665Q(sl1 sl1Var, int i, yp1 yp1Var) {
        int i2;
        int i3;
        Object objInvoke;
        mt2 mt2VarM10644P;
        ch2 ch2VarM10857S0;
        int size;
        int i4;
        C0940nb c0940nb;
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var = sl1Var.f25195a.f25199e;
        wf2 wf2VarM10652X = sc6.m10652X(sl1Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (wf2VarM10652X == null) {
                mt2VarM10644P = null;
                break;
            }
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                while (mt2Var != null) {
                    if ((mt2Var.f25197c & 1024) != 0) {
                        mt2VarM10644P = mt2Var;
                        uw2 uw2Var = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof sl1) {
                                break loop0;
                            }
                            if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                int i5 = 0;
                                for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                    if ((mt2Var2.f25197c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            mt2VarM10644P = mt2Var2;
                                        } else {
                                            if (uw2Var == null) {
                                                uw2Var = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var.m11663b(mt2Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var);
                        }
                    }
                    mt2Var = mt2Var.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
        sl1 sl1Var2 = (sl1) mt2VarM10644P;
        if ((sl1Var2 == null || !z62.m13387o(sl1Var2.m10857S0(), sl1Var.m10857S0())) && (ch2VarM10857S0 = sl1Var.m10857S0()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                C1077qn.m9989o("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (ch2VarM10857S0.f16018o.f18120a.m10789h().f24954o <= 0 || ch2VarM10857S0.f16018o.f18120a.m10789h().f24951l.isEmpty() || !ch2VarM10857S0.f25208n) {
                return yp1Var.invoke(ch2.f16017r);
            }
            boolean zM4027P0 = ch2VarM10857S0.m4027P0(i6);
            ei2 ei2Var = ch2VarM10857S0.f16018o;
            int iMin = zM4027P0 ? Math.min(ei2Var.f18120a.m10789h().f24954o - 1, ((ni2) hb0.m6306R0(ei2Var.f18120a.m10789h().f24951l)).f25846a) : Math.max(0, ei2Var.f18120a.m10788g());
            ql3 ql3Var = new ql3();
            ql3Var.f28555a = ch2VarM10857S0.f16019p.m3420a(iMin, iMin);
            si2 si2Var = ch2VarM10857S0.f16018o.f18120a;
            if (si2Var.m10789h().f24951l.isEmpty()) {
                i3 = 0;
            } else {
                mi2 mi2VarM10789h = si2Var.m10789h();
                int iM8333i = (int) (mi2VarM10789h.f24955p == d63.f16814a ? mi2VarM10789h.m8333i() & 4294967295L : mi2VarM10789h.m8333i() >> 32);
                mi2 mi2VarM10789h2 = si2Var.m10789h();
                List list = mi2VarM10789h2.f24951l;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((ni2) list.get(i8)).f25860o;
                    }
                    size = (i7 / list.size()) + mi2VarM10789h2.f24957r;
                }
                if (size != 0 && (i4 = iM8333i / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = ch2VarM10857S0.f16018o.f18120a.m10789h().f24954o;
            if (i9 > i10) {
                i9 = i10;
            }
            while (objInvoke == null && ch2VarM10857S0.m4026O0((yg2) ql3Var.f28555a, i6) && i2 < i9) {
                yg2 yg2Var = (yg2) ql3Var.f28555a;
                int i11 = yg2Var.f35211a;
                int i12 = yg2Var.f35212b;
                if (ch2VarM10857S0.m4027P0(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                yg2 yg2VarM3420a = ch2VarM10857S0.f16019p.m3420a(i11, i12);
                ch2VarM10857S0.f16019p.f15048a.m11671k((yg2) ql3Var.f28555a);
                ql3Var.f28555a = yg2VarM3420a;
                i2++;
                sc6.m10652X(ch2VarM10857S0).m12285l();
                bh2 bh2Var = new bh2();
                bh2Var.f15267a = ch2VarM10857S0;
                bh2Var.f15268b = ql3Var;
                bh2Var.f15269c = i6;
                VarHandle.storeStoreFence();
                objInvoke = yp1Var.invoke(bh2Var);
            }
            ch2VarM10857S0.f16019p.f15048a.m11671k((yg2) ql3Var.f28555a);
            sc6.m10652X(ch2VarM10857S0).m12285l();
            return objInvoke;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX INFO: renamed from: R */
    public static final int m13666R(d04 d04Var, int i) {
        int i2;
        int[] iArr = d04Var.f16687f;
        int i3 = i + 1;
        int length = d04Var.f16686e.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: S */
    public static String m13667S(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        return i == 3 ? "Sentences" : "Invalid";
    }

    /* JADX INFO: renamed from: T */
    public static final dp4 m13668T(Object obj, String str, mi0 mi0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new dp4(new tw2(obj), null, str);
            ir1Var.m6905n0(objM6869O);
        }
        dp4 dp4Var = (dp4) objM6869O;
        dp4Var.m4639a(obj, ir1Var, (i & 8) | 48 | (i & 14));
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (objM6869O2 == i50Var) {
            ep4 ep4Var = new ep4((byte) 0);
            ep4Var.f18357b = dp4Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(ep4Var);
            obj2 = ep4Var;
        }
        lb5.m7923d(dp4Var, (yp1) obj2, ir1Var);
        return dp4Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m13669a(yp1 yp1Var, nt2 nt2Var, yp1 yp1Var2, yp1 yp1Var3, mi0 mi0Var, int i) {
        byte b;
        yp1 yp1Var4;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-180024211);
        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
        int i2 = i | (ir1Var.m6894i(yp1Var) ? 4 : 2) | (ir1Var.m6890g(nt2Var) ? 32 : 16) | 24960;
        if (ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var.mo7630d(ok1.f26802a).mo7630d(rl1.f29390a).mo7630d(tl1.f31221a).mo7630d(ol1.f26841a));
            ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            df2 df2Var = (df2) ir1Var.m6898k(ij0.f21479n);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            lk2 lk2Var = (lk2) ir1Var.m6898k(rm2.f29413a);
            av3 av3Var = (av3) ir1Var.m6898k(xm2.f34419a);
            ir1Var.m6885d0(1314774735);
            int i3 = i2 & 14;
            int iHashCode2 = Long.hashCode(ir1Var.f21683T);
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
            lu3 lu3Var = (lu3) ir1Var.m6898k(ou3.f27125a);
            View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
            byte b2 = 6;
            boolean zM6894i = ir1Var.m6894i(context) | ((((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(yp1Var)) || (i3 & 6) == 4) | ir1Var.m6894i(gr1VarM4685N) | ir1Var.m6894i(lu3Var) | ir1Var.m6886e(iHashCode2) | ir1Var.m6894i(view);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0652fi c0652fi = new C0652fi();
                c0652fi.f19006a = context;
                c0652fi.f19007b = yp1Var;
                c0652fi.f19008c = gr1VarM4685N;
                c0652fi.f19009d = lu3Var;
                c0652fi.f19010e = iHashCode2;
                c0652fi.f19011f = view;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0652fi);
                obj = c0652fi;
            }
            obj = objM6869O;
            wp1 wp1Var = (wp1) obj;
            if (!(interfaceC0618en instanceof gt4)) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6875X(125, 1, null, null);
            ir1Var.f21702r = true;
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wp1Var);
            } else {
                ir1Var.m6911q0();
            }
            bi0.f15310ap.getClass();
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, new sg0((byte) 7), nt2VarM10006A);
            C0006a5.m53I(ir1Var, new sg0((byte) 8), ky0Var);
            C0006a5.m53I(ir1Var, new sg0((byte) 9), lk2Var);
            C0006a5.m53I(ir1Var, new sg0((byte) 10), av3Var);
            C0006a5.m53I(ir1Var, new sg0((byte) 11), df2Var);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            sg0 sg0Var = new sg0((byte) 5);
            yp1Var4 = f36238a;
            C0006a5.m53I(ir1Var, sg0Var, yp1Var4);
            C0006a5.m53I(ir1Var, new sg0(b2), yp1Var2);
            ir1Var.m6912r(true);
            b = 0;
            ir1Var.m6912r(false);
        } else {
            b = 0;
            ir1Var.m6874W();
            yp1Var4 = yp1Var3;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0613ei c0613ei = new C0613ei(b);
            c0613ei.f18113c = yp1Var;
            c0613ei.f18112b = nt2Var;
            c0613ei.f18114d = yp1Var2;
            c0613ei.f18115e = yp1Var4;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0613ei;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final um0 m13670b(ro0 ro0Var) {
        if (ro0Var.get(o85.f26448h) == null) {
            ro0Var = ro0Var.plus(y70.m13021a());
        }
        return new um0(ro0Var);
    }

    /* JADX INFO: renamed from: c */
    public static final void m13671c(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(2064964257);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            m13672d(nt2Var, pg0Var, ir1Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0688gh c0688gh = new C0688gh(b);
            c0688gh.f19788b = nt2Var;
            c0688gh.f19789c = pg0Var;
            c0688gh.f19790d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0688gh;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13672d(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(771959668);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 256 : 128;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                d83 d83Var = new d83(null, o85.f26450j);
                ir1Var.m6905n0(d83Var);
                objM6869O = d83Var;
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (objM6869O2 == i50Var) {
                C0725hh c0725hh = new C0725hh(b2);
                c0725hh.f20571b = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0725hh);
                obj = c0725hh;
            }
            zh3 zh3VarMo7523a = nj4.f25891b.mo7523a(m13658J((wp1) obj, ir1Var, 0));
            C0712h4 c0712h4 = new C0712h4(b);
            c0712h4.f20357b = nt2Var;
            c0712h4.f20358c = sw2Var;
            c0712h4.f20359d = pg0Var;
            VarHandle.storeStoreFence();
            as4.m3244c(zh3VarMo7523a, vd6.m11834R(-291176396, c0712h4, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0688gh c0688gh = new C0688gh(b3);
            c0688gh.f19788b = nt2Var;
            c0688gh.f19789c = pg0Var;
            c0688gh.f19790d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0688gh;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final long m13673e(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = to4.f31293c;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: f */
    public static final void m13674f(dp4 dp4Var, bp4 bp4Var, Object obj, Object obj2, ag1 ag1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(867041821);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dp4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(bp4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ir1Var.m6890g(obj) : ir1Var.m6894i(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? ir1Var.m6890g(obj2) : ir1Var.m6894i(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? ir1Var.m6890g(ag1Var) : ir1Var.m6894i(ag1Var) ? 16384 : 8192;
        }
        if (!ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            ir1Var.m6874W();
        } else if (dp4Var.m4648j()) {
            bp4Var.m3658g(obj, obj2, ag1Var);
        } else {
            bp4Var.m3659h(obj2, ag1Var, null, null);
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0963ny c0963ny = new C0963ny((byte) 3);
            c0963ny.f26184d = dp4Var;
            c0963ny.f26182b = bp4Var;
            c0963ny.f26185e = obj;
            c0963ny.f26186f = obj2;
            c0963ny.f26187g = ag1Var;
            c0963ny.f26183c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0963ny;
        }
    }

    /* JADX INFO: renamed from: g */
    public static v52 m13675g(xa3 xa3Var, fy3 fy3Var, z52 z52Var, FrameLayout frameLayout, Map map, ImageView.ScaleType scaleType) {
        s21 s21Var = s21.f11110k0;
        v71 v71Var = v71.f32439a;
        if (cy3.m656b().f1710a == null) {
            kx2 kx2VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
            try {
                v52 v52Var = new v52(z52Var.m2806a(frameLayout, scaleType, map), z52Var.m2809c(frameLayout), z52Var.m2808b(frameLayout), z52Var.m2805a(frameLayout), z52Var.m2804a());
                kx2VarM2635a.close();
                return v52Var;
            } catch (Throwable th) {
                try {
                    kx2VarM2635a.m1736b(th);
                    if (th instanceof ka5) {
                        throw th;
                    }
                    if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                        kx2VarM2635a.m1735a(th);
                    }
                    if (th instanceof zm4) {
                        throw new j31(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new w01(th);
                    }
                    if (th instanceof w11) {
                        throw th;
                    }
                    throw new b11(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lb5.m7941v(kx2VarM2635a, th2);
                        throw th3;
                    }
                }
            }
        }
        mx3 mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
        try {
            v52 v52Var2 = new v52(z52Var.m2806a(frameLayout, scaleType, map), z52Var.m2809c(frameLayout), z52Var.m2808b(frameLayout), z52Var.m2805a(frameLayout), z52Var.m2804a());
            mx3VarM655a.close();
            return v52Var2;
        } catch (Throwable th4) {
            try {
                mx3VarM655a.m1736b(th4);
                if (th4 instanceof ka5) {
                    throw th4;
                }
                if (!(th4 instanceof zm4) && !(th4 instanceof CancellationException)) {
                    mx3VarM655a.m1735a(th4);
                }
                if (th4 instanceof zm4) {
                    throw new j31(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new w01(th4);
                }
                if (th4 instanceof w11) {
                    throw th4;
                }
                throw new b11(th4);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    lb5.m7941v(mx3VarM655a, th5);
                    throw th6;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m13676h(int i, String str) {
        return c75.m3877i(i, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m13677i(tx3 tx3Var, float f, C0457ak c0457ak, gv0 gv0Var, yp1 yp1Var, ym0 ym0Var) {
        b94 b94Var;
        nl3 nl3Var;
        if (ym0Var instanceof b94) {
            b94Var = (b94) ym0Var;
            int i = b94Var.f15184x;
            if ((i & Integer.MIN_VALUE) != 0) {
                b94Var.f15184x = i - Integer.MIN_VALUE;
            } else {
                b94Var = new b94(ym0Var);
            }
        } else {
            b94Var = new b94(ym0Var);
        }
        Object obj = b94Var.f15183w;
        ap0 ap0Var = ap0.f14763a;
        int i2 = b94Var.f15184x;
        if (i2 == 0) {
            k43.m7376J(obj);
            nl3 nl3Var2 = new nl3();
            byte b = 0;
            boolean z = ((Number) c0457ak.m3020a()).floatValue() == 0.0f;
            a94 a94Var = new a94(b);
            a94Var.f193b = f;
            a94Var.f194c = nl3Var2;
            a94Var.f195d = tx3Var;
            a94Var.f196e = yp1Var;
            VarHandle.storeStoreFence();
            b94Var.f15181u = c0457ak;
            b94Var.f15182v = nl3Var2;
            b94Var.f15180t = f;
            b94Var.f15184x = 1;
            if (qs5.m10105j(c0457ak, gv0Var, !z, a94Var, b94Var) == ap0Var) {
                return ap0Var;
            }
            nl3Var = nl3Var2;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = b94Var.f15180t;
            nl3Var = b94Var.f15182v;
            c0457ak = b94Var.f15181u;
            k43.m7376J(obj);
        }
        return new C1295wj(new Float(f - nl3Var.f25933a), c0457ak);
    }

    /* JADX INFO: renamed from: j */
    public static final void m13678j(C1370yj c1370yj, tx3 tx3Var, yp1 yp1Var, float f) {
        float fMo3369a;
        try {
            fMo3369a = tx3Var.mo3369a(f);
        } catch (CancellationException unused) {
            c1370yj.m13145a();
            fMo3369a = 0.0f;
        }
        yp1Var.invoke(Float.valueOf(fMo3369a));
        if (Math.abs(f - fMo3369a) > 0.5f) {
            c1370yj.m13145a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public static final Object m13679k(tx3 tx3Var, float f, float f2, C0457ak c0457ak, InterfaceC1407zj interfaceC1407zj, yp1 yp1Var, ym0 ym0Var) {
        c94 c94Var;
        nl3 nl3Var;
        C0457ak c0457ak2;
        float f3;
        if (ym0Var instanceof c94) {
            c94Var = (c94) ym0Var;
            int i = c94Var.f15899y;
            if ((i & Integer.MIN_VALUE) != 0) {
                c94Var.f15899y = i - Integer.MIN_VALUE;
            } else {
                c94Var = new c94(ym0Var);
            }
        } else {
            c94Var = new c94(ym0Var);
        }
        c94 c94Var2 = c94Var;
        Object obj = c94Var2.f15898x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c94Var2.f15899y;
        byte b = 1;
        if (i2 == 0) {
            k43.m7376J(obj);
            nl3 nl3Var2 = new nl3();
            float fFloatValue = ((Number) c0457ak.m3020a()).floatValue();
            Float f4 = new Float(f);
            boolean z = ((Number) c0457ak.m3020a()).floatValue() == 0.0f;
            a94 a94Var = new a94(b);
            a94Var.f193b = f2;
            a94Var.f194c = nl3Var2;
            a94Var.f195d = tx3Var;
            a94Var.f196e = yp1Var;
            VarHandle.storeStoreFence();
            c94Var2.f15896v = c0457ak;
            c94Var2.f15897w = nl3Var2;
            c94Var2.f15894t = f;
            c94Var2.f15895u = fFloatValue;
            c94Var2.f15899y = 1;
            if (qs5.m10106k(c0457ak, f4, interfaceC1407zj, !z, a94Var, c94Var2) == ap0Var) {
                return ap0Var;
            }
            nl3Var = nl3Var2;
            c0457ak2 = c0457ak;
            f3 = fFloatValue;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = c94Var2.f15895u;
            f = c94Var2.f15894t;
            nl3Var = c94Var2.f15897w;
            c0457ak2 = c94Var2.f15896v;
            k43.m7376J(obj);
        }
        return new C1295wj(new Float(f - nl3Var.f25933a), k43.m7388m(c0457ak2, 0.0f, m13683o(((Number) c0457ak2.m3020a()).floatValue(), f3), 29));
    }

    /* JADX INFO: renamed from: l */
    public static final void m13680l(File file, File file2) throws IllegalAccessException, IOException, InvocationTargetException {
        Path path = file.toPath();
        Path path2 = file2.toPath();
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e) {
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e2) {
                se0.m10720f(e2, e);
                throw e2;
            }
        } catch (FileAlreadyExistsException e3) {
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e4) {
                se0.m10720f(e4, e3);
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final yj3 m13681m(f74 f74Var) {
        yj3 yj3Var = new yj3();
        yj3Var.f35265a = f74Var;
        yj3Var.f35266b = new w30();
        VarHandle.storeStoreFence();
        return yj3Var;
    }

    /* JADX INFO: renamed from: n */
    public static final void m13682n(zo0 zo0Var, CancellationException cancellationException) {
        t82 t82Var = (t82) zo0Var.mo6367f().get(o85.f26448h);
        if (t82Var != null) {
            t82Var.mo4993a(cancellationException);
        } else {
            nm0.m8798k(zo0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX INFO: renamed from: o */
    public static final float m13683o(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX INFO: renamed from: p */
    public static final int m13684p(long j, long j2) {
        boolean zM13655F = m13655F(j);
        if (zM13655F != m13655F(j2)) {
            return zM13655F ? -1 : 1;
        }
        int iSignum = (int) Math.signum(m13650A(j) - m13650A(j2));
        if (Math.min(m13650A(j), m13650A(j2)) >= 0.0f && m13654E(j) != m13654E(j2)) {
            return m13654E(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX INFO: renamed from: q */
    public static final Object m13685q(mq1 mq1Var, wm0 wm0Var) {
        nw3 nw3Var = new nw3(wm0Var, wm0Var.getContext());
        Object objM3235N = as4.m3235N(nw3Var, true, nw3Var, mq1Var);
        ap0 ap0Var = ap0.f14763a;
        return objM3235N;
    }

    /* JADX INFO: renamed from: r */
    public static final dp4 m13686r(dp4 dp4Var, b91 b91Var, b91 b91Var2, String str, mi0 mi0Var, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && ((ir1) mi0Var).m6890g(dp4Var)) || (i & 6) == 4;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (z2 || objM6869O == i50Var) {
            objM6869O = new dp4(new tw2(b91Var), dp4Var, dp4Var.f17260c + " > " + str);
            ir1Var.m6905n0(objM6869O);
        }
        dp4 dp4Var2 = (dp4) objM6869O;
        if ((i2 <= 4 || !ir1Var.m6890g(dp4Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zM6890g = ir1Var.m6890g(dp4Var2) | z;
        Object objM6869O2 = ir1Var.m6869O();
        Object obj = objM6869O2;
        if (zM6890g || objM6869O2 == i50Var) {
            cz3 cz3Var = new cz3((byte) 16);
            cz3Var.f16638b = dp4Var;
            cz3Var.f16639c = dp4Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(cz3Var);
            obj = cz3Var;
        }
        lb5.m7923d(dp4Var2, (yp1) obj, ir1Var);
        if (dp4Var.m4648j()) {
            dp4Var2.m4652n(b91Var, b91Var2);
            return dp4Var2;
        }
        dp4Var2.m4659u(b91Var2);
        dp4Var2.f17269l.setValue(Boolean.FALSE);
        return dp4Var2;
    }

    /* JADX INFO: renamed from: s */
    public static final yo4 m13687s(dp4 dp4Var, sq4 sq4Var, String str, mi0 mi0Var, int i, int i2) {
        xo4 xo4Var;
        boolean zM6890g = ((ir1) mi0Var).m6890g(dp4Var);
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (zM6890g || objM6869O == i50Var) {
            yo4 yo4Var = new yo4();
            yo4Var.f35431c = dp4Var;
            yo4Var.f35429a = sq4Var;
            yo4Var.f35430b = k43.m7398w(null);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(yo4Var);
            obj = yo4Var;
        }
        yo4 yo4Var2 = (yo4) obj;
        boolean zM6890g2 = ir1Var.m6890g(dp4Var) | ir1Var.m6894i(yo4Var2);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (zM6890g2 || objM6869O2 == i50Var) {
            cz3 cz3Var = new cz3((byte) 17);
            cz3Var.f16638b = dp4Var;
            cz3Var.f16639c = yo4Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(cz3Var);
            obj2 = cz3Var;
        }
        lb5.m7923d(yo4Var2, (yp1) obj2, ir1Var);
        if (dp4Var.m4648j() && (xo4Var = (xo4) yo4Var2.f35430b.getValue()) != null) {
            dp4 dp4Var2 = yo4Var2.f35431c;
            xo4Var.f34508a.m3658g(xo4Var.f34510c.invoke(dp4Var2.m4645g().mo3110a()), xo4Var.f34510c.invoke(dp4Var2.m4645g().mo3111d()), (ag1) xo4Var.f34509b.invoke(dp4Var2.m4645g()));
        }
        return yo4Var2;
    }

    /* JADX INFO: renamed from: t */
    public static final bp4 m13688t(dp4 dp4Var, Object obj, Object obj2, ag1 ag1Var, sq4 sq4Var, mi0 mi0Var, int i) {
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ((ir1) mi0Var).m6890g(dp4Var)) || (i & 6) == 4;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (z2 || objM6869O == i50Var) {
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                obj3 = obj2;
                AbstractC0654fk abstractC0654fk = (AbstractC0654fk) sq4Var.f30508a.invoke(obj3);
                abstractC0654fk.mo3609d();
                obj4 = obj;
                bp4 bp4Var = new bp4(dp4Var, obj4, abstractC0654fk, sq4Var);
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                ir1Var.m6905n0(bp4Var);
                objM6869O = bp4Var;
            } catch (Throwable th) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        bp4 bp4Var2 = (bp4) objM6869O;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        m13674f(dp4Var, bp4Var2, obj4, obj3, ag1Var, ir1Var, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !ir1Var.m6890g(dp4Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zM6890g = ir1Var.m6890g(bp4Var2) | z;
        Object objM6869O2 = ir1Var.m6869O();
        Object obj5 = objM6869O2;
        if (zM6890g || objM6869O2 == i50Var) {
            cz3 cz3Var = new cz3((byte) 15);
            cz3Var.f16638b = dp4Var;
            cz3Var.f16639c = bp4Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(cz3Var);
            obj5 = cz3Var;
        }
        lb5.m7923d(bp4Var2, (yp1) obj5, ir1Var);
        return bp4Var2;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m13689u(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return z62.m13387o(hd4.m6360z0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static final float m13690v(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX INFO: renamed from: w */
    public static Method m13691w(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        Object obj;
        boolean z;
        int length = methodArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            method = methodArr[i];
            if (str.equals(method.getName()) || od4.m9043X(method.getName(), str.concat("-"), z2)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z3 = z2;
                    ?? r12 = z3;
                    while (r11 < length2) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        if (rl3.m10361a(cls).equals(rl3.m10361a(cls2)) || cls.isAssignableFrom(cls2)) {
                            r11 = z3;
                            r11 = z3;
                            z = true;
                        } else {
                            r11 = z3;
                            z = false;
                        }
                        arrayList.add(Boolean.valueOf(z));
                        r12 = i2;
                        r11++;
                    }
                    r11 = z3;
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        do {
                            if (i3 < size) {
                                obj = arrayList.get(i3);
                                i3++;
                            }
                        } while (((Boolean) obj).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i++;
            z2 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    /* JADX INFO: renamed from: x */
    public static Method m13692x(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                r52 r52VarM10660c0 = sc6.m10660c0(0, iCeil);
                ArrayList arrayList2 = new ArrayList(ib0.m6717y0(r52VarM10660c0, 10));
                Iterator it = r52VarM10660c0.iterator();
                while (((q52) it).f28225c) {
                    ((q52) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                cu2 cu2Var = new cu2(3);
                ArrayList arrayList3 = cu2Var.f16495a;
                cu2Var.m4168a(clsArr);
                arrayList3.add(mi0.class);
                cu2Var.m4168a(clsArr2);
                return m13691w(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!z62.m13387o(method.getName(), str)) {
                        if (!od4.m9043X(method.getName(), str + "-", false)) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final String m13693y(Collection collection) {
        return !collection.isEmpty() ? id4.m6766M(hb0.m6305Q0(collection, ",\n", "\n", "\n", 0, null, 56)).concat("},") : " }";
    }

    /* JADX INFO: renamed from: z */
    public static final lk2 m13694z(View view) {
        while (view != null) {
            Object tag = view.getTag(C0995R.id.view_tree_lifecycle_owner);
            lk2 lk2Var = tag instanceof lk2 ? (lk2) tag : null;
            if (lk2Var != null) {
                return lk2Var;
            }
            Object objM8506p = n40.m8506p(view);
            view = objM8506p instanceof View ? (View) objM8506p : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public abstract n40 mo5504H(int i, byte[] bArr);
}
