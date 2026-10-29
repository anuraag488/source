package p000;

import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.bk1;
import ads_mobile_sdk.fp3;
import ads_mobile_sdk.z21;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.window.BackEvent;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class sc6 {

    /* JADX INFO: renamed from: a */
    public static if1 f30164a;

    /* JADX INFO: renamed from: b */
    public static final double[][] f30165b = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: c */
    public static final double[][] f30166c = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: d */
    public static final double[] f30167d = {95.047d, 100.0d, 108.883d};

    /* JADX INFO: renamed from: e */
    public static final pg0 f30168e = new pg0(-1183496416, false, new me0(3));

    /* JADX INFO: renamed from: f */
    public static final da2 f30169f = new da2(20);

    /* JADX INFO: renamed from: g */
    public static final Object f30170g = new Object();

    /* JADX INFO: renamed from: h */
    public static final z45 f30171h = new z45(16);

    /* JADX INFO: renamed from: i */
    public static final ed1 f30172i;

    /* JADX INFO: renamed from: j */
    public static final ed1[] f30173j;

    static {
        ed1 ed1Var = new ed1("app_set_id", 1L);
        f30172i = ed1Var;
        f30173j = new ed1[]{ed1Var};
    }

    /* JADX INFO: renamed from: A */
    public static s50 m10629A(String str) {
        s50 s50Var = new s50(str.getBytes(z80.f35863a));
        s50Var.f29914c = str;
        return s50Var;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m10630B(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: C */
    public static final nt2 m10631C(yp1 yp1Var) {
        gl1 gl1Var = new gl1();
        gl1Var.f19852a = yp1Var;
        VarHandle.storeStoreFence();
        dl1 dl1Var = new dl1();
        dl1Var.f17142a = gl1Var;
        VarHandle.storeStoreFence();
        return dl1Var;
    }

    /* JADX INFO: renamed from: D */
    public static qf0 m10632D(String str, wb1 wb1Var) {
        pf0 pf0VarM9880b = qf0.m9880b(C0811ju.class);
        pf0VarM9880b.f27575e = true;
        pf0VarM9880b.m9509a(ny0.m8897b(Context.class));
        C1163sz c1163sz = new C1163sz((byte) 9);
        c1163sz.f30676b = str;
        c1163sz.f30677c = wb1Var;
        VarHandle.storeStoreFence();
        pf0VarM9880b.f27576f = c1163sz;
        return pf0VarM9880b.m9510b();
    }

    /* JADX INFO: renamed from: E */
    public static final int m10633E(gf4 gf4Var, String str) {
        int iM13535u = zc6.m13535u(gf4Var, str);
        if (iM13535u >= 0) {
            return iM13535u;
        }
        int columnCount = gf4Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(gf4Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + hb0.m6305Q0(arrayList, null, null, null, 0, null, 63) + ']');
    }

    /* JADX INFO: renamed from: F */
    public static final lk3 m10634F(xh3 xh3Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        lk3 lk3Var = (lk3) ir1Var.m6898k(xh3Var);
        if (lk3Var != null) {
            return lk3Var;
        }
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        lk3 lk3Var2 = o85.f26444d;
        if (lk3Var2 != null) {
            return lk3Var2;
        }
        synchronized (o85.f26443c) {
            lk3 lk3Var3 = o85.f26444d;
            if (lk3Var3 != null) {
                return lk3Var3;
            }
            context.getApplicationContext();
            lk3 lk3VarM13285a = new z02(context).m13285a();
            o85.f26444d = lk3VarM13285a;
            return lk3VarM13285a;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m10635G() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: renamed from: H */
    public static double m10636H(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    /* JADX INFO: renamed from: I */
    public static double[] m10637I(int i) {
        double dM10641M = m10641M((i >> 16) & 255);
        double dM10641M2 = m10641M((i >> 8) & 255);
        double dM10641M3 = m10641M(i & 255);
        double[][] dArr = f30165b;
        double[] dArr2 = dArr[0];
        double d = (dArr2[2] * dM10641M3) + (dArr2[1] * dM10641M2) + (dArr2[0] * dM10641M);
        double[] dArr3 = dArr[1];
        double d2 = (dArr3[2] * dM10641M3) + (dArr3[1] * dM10641M2) + (dArr3[0] * dM10641M);
        double[] dArr4 = dArr[2];
        double d3 = (dArr4[2] * dM10641M3) + (dArr4[1] * dM10641M2) + (dArr4[0] * dM10641M);
        double[] dArr5 = f30167d;
        double d4 = d / dArr5[0];
        double d5 = d2 / dArr5[1];
        double d6 = d3 / dArr5[2];
        double dM10636H = m10636H(d4);
        double dM10636H2 = m10636H(d5);
        return new double[]{(116.0d * dM10636H2) - 16.0d, (dM10636H - dM10636H2) * 500.0d, (dM10636H2 - m10636H(d6)) * 200.0d};
    }

    /* JADX INFO: renamed from: J */
    public static double m10638J(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((116.0d * d) - 16.0d) / 903.2962962962963d;
    }

    /* JADX INFO: renamed from: K */
    public static String m10639K(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM10844j = sk5.m10844j("<", str2, " threw ");
                    sbM10844j.append(e.getClass().getName());
                    sbM10844j.append(">");
                    string = sbM10844j.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public static double m10640L(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM10664e0 = m10664e0(d);
        double d3 = ((dM10664e0 + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM10647S = m10647S(d3, dM10664e0);
        double dAbs = Math.abs(dM10647S - d2);
        if (dM10647S < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM10636H = ((m10636H(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (dM10636H < 0.0d || dM10636H > 100.0d) {
            return -1.0d;
        }
        return dM10636H;
    }

    /* JADX INFO: renamed from: M */
    public static double m10641M(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    /* JADX INFO: renamed from: N */
    public static double m10642N(int i) {
        return (m10636H(m10662d0(i)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    /* JADX INFO: renamed from: O */
    public static final void m10643O(Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof LinkageError)) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: P */
    public static final mt2 m10644P(uw2 uw2Var) {
        int i;
        if (uw2Var == null || (i = uw2Var.f32213c) == 0) {
            return null;
        }
        return (mt2) uw2Var.m11672l(i - 1);
    }

    /* JADX INFO: renamed from: Q */
    public static ma0 m10645Q(float f, float f2) {
        ma0 ma0Var = new ma0();
        ma0Var.f24778a = f;
        ma0Var.f24779b = f2;
        VarHandle.storeStoreFence();
        return ma0Var;
    }

    /* JADX INFO: renamed from: R */
    public static double m10646R(double d, double d2) {
        return m10647S(m10664e0(d), m10664e0(d2));
    }

    /* JADX INFO: renamed from: S */
    public static double m10647S(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }

    /* JADX INFO: renamed from: T */
    public static List m10648T(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m10649U(px0 px0Var) {
        C1287wb c1287wbM14033getAutofillManager;
        wf2 wf2VarM10652X = m10652X(px0Var);
        if (wf2VarM10652X.f33331u || (c1287wbM14033getAutofillManager = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2VarM10652X)).getAutofillManager()) == null) {
            return;
        }
        Rect rect = c1287wbM14033getAutofillManager.f33204f;
        ll3 ll3Var = c1287wbM14033getAutofillManager.f33202d;
        wf2 wf2Var = (wf2) ll3Var.f24126a.m8197b(wf2VarM10652X.f33312b);
        if (wf2Var == null || wf2Var.f33317g == -4) {
            return;
        }
        C0795je c0795je = ll3Var.f24128c;
        int iM8029d = ll3Var.m8029d(wf2Var);
        long[] jArr = (long[]) c0795je.f22194c;
        long j = jArr[iM8029d];
        long j2 = jArr[iM8029d + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        c1287wbM14033getAutofillManager.f33199a.m13308F().requestAutofill(c1287wbM14033getAutofillManager.f33201c, wf2VarM10652X.f33312b, rect);
    }

    /* JADX INFO: renamed from: V */
    public static final e13 m10650V(px0 px0Var, int i) {
        e13 e13Var = ((mt2) px0Var).f25195a.f25202h;
        return (e13Var.mo4871Z0() == px0Var && f13.m5457g(i)) ? e13Var.f17628x : e13Var;
    }

    /* JADX INFO: renamed from: W */
    public static final e13 m10651W(px0 px0Var) {
        if (!((mt2) px0Var).f25195a.f25208n) {
            q32.m9721c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        e13 e13VarM10650V = m10650V(px0Var, 2);
        if (!e13VarM10650V.mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinates is not attached.");
        }
        return e13VarM10650V;
    }

    /* JADX INFO: renamed from: X */
    public static final wf2 m10652X(px0 px0Var) {
        e13 e13Var = ((mt2) px0Var).f25195a.f25202h;
        if (e13Var != null) {
            return e13Var.f17625u;
        }
        throw d55.m4363h("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: Y */
    public static final r63 m10653Y(px0 px0Var) {
        r63 r63Var = m10652X(px0Var).f33325o;
        if (r63Var != null) {
            return r63Var;
        }
        throw d55.m4363h("This node does not have an owner.");
    }

    /* JADX INFO: renamed from: Z */
    public static p52 m10654Z(r52 r52Var, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = r52Var.f27382a;
        int i3 = r52Var.f27383b;
        if (r52Var.f27384c <= 0) {
            i = -i;
        }
        return new p52(i2, i3, i);
    }

    /* JADX INFO: renamed from: a */
    public static final xf3 m10655a(String str, tf3 tf3Var) {
        if (hd4.m6345k0(str)) {
            C1077qn.m9987m("Blank serial names are prohibited");
            return null;
        }
        Iterator it = ((up2) zf3.f36048a.values()).iterator();
        while (((qp2) it).hasNext()) {
            jc2 jc2Var = (jc2) ((qp2) it).next();
            if (str.equals(jc2Var.mo15d().mo3641b())) {
                StringBuilder sbM10844j = sk5.m10844j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM10844j.append(rl3.m10361a(jc2Var.getClass()).m10249b());
                sbM10844j.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                C1077qn.m9987m(id4.m6767N(sbM10844j.toString()));
                return null;
            }
        }
        return new xf3(str, tf3Var);
    }

    /* JADX INFO: renamed from: a0 */
    public static final long m10656a0(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        if (i == oc0.f26567u.f23931c) {
            return zy5.m13858V(j);
        }
        if ((i == oc0.f26568v.f23931c || i == oc0.f26569w.f23931c) && Build.VERSION.SDK_INT < 34) {
            return zy5.m13858V(j);
        }
        return (i != oc0.f26570x.f23931c || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : zy5.m13858V(j);
    }

    /* JADX INFO: renamed from: b */
    public static final long m10657b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            r32.m10186a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = ql4.f28557c;
        return j;
    }

    /* JADX INFO: renamed from: b0 */
    public static final bz2 m10658b0(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        long frameTimeMillis = Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L;
        bz2 bz2Var = new bz2();
        bz2Var.f15699a = swipeEdge;
        bz2Var.f15700b = progress;
        bz2Var.f15701c = touchX;
        bz2Var.f15702d = touchY;
        bz2Var.f15703e = frameTimeMillis;
        VarHandle.storeStoreFence();
        return bz2Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m10659c(wa2 wa2Var, z21 z21Var, fp3 fp3Var) {
        wa2Var.m12181u(Long.valueOf(i41.m6647f(fp3Var.f3656a)), String.valueOf(z21Var.getNumber()));
    }

    /* JADX INFO: renamed from: c0 */
    public static r52 m10660c0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new r52(i, i2 - 1, 1);
        }
        r52 r52Var = r52.f29026d;
        return r52.f29026d;
    }

    /* JADX INFO: renamed from: d */
    public static void m10661d(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap map = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    map.put(str, uri.getQueryParameter(str));
                }
                try {
                    AbstractC0647fd.m5677o(bk1.f1224b.f1225a.getApplicationContext(), (String) map.get("mechanism"), new C0310ra(map));
                } catch (Exception e) {
                    Log.e("OMIDLIB", "Error processing attestation request in OmidNativeUrlHandler", e);
                }
            }
        } catch (Exception e2) {
            Log.e("OMIDLIB", "OmidNativeUrlHandler failed to handle url [" + uri.toString() + "]", e2);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static double[] m10662d0(int i) {
        return dt0.m4683L(new double[]{m10641M((i >> 16) & 255), m10641M((i >> 8) & 255), m10641M(i & 255)}, f30165b);
    }

    /* JADX INFO: renamed from: e */
    public static final void m10663e(uw2 uw2Var, mt2 mt2Var) {
        uw2 uw2VarM12248A = m10652X(mt2Var).m12248A();
        int i = uw2VarM12248A.f32213c - 1;
        Object[] objArr = uw2VarM12248A.f32211a;
        if (i < objArr.length) {
            while (i >= 0) {
                uw2Var.m11663b((mt2) ((wf2) objArr[i]).f33299G.f25610g);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static double m10664e0(double d) {
        return m10638J((d + 16.0d) / 116.0d) * 100.0d;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m10665f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wh3) obj) != wh3.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ib0.m6717y0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((wh3) obj2).f33392a);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    public static int m10666g(int i, int i2, int i3) {
        return ((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m10667h(double d, double d2, double d3) {
        double[][] dArr = f30166c;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        return m10666g(m10684y(d4), m10684y(d5), m10684y((dArr4[2] * d3) + (dArr4[1] * d2) + (dArr4[0] * d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final lf2 m10668i(mt2 mt2Var) {
        if ((mt2Var.f25197c & 2) != 0) {
            if (mt2Var instanceof lf2) {
                return (lf2) mt2Var;
            }
            if (mt2Var instanceof qx0) {
                mt2 mt2Var2 = ((qx0) mt2Var).f28863p;
                while (mt2Var2 != 0) {
                    if (mt2Var2 instanceof lf2) {
                        return (lf2) mt2Var2;
                    }
                    mt2Var2 = (!(mt2Var2 instanceof qx0) || (mt2Var2.f25197c & 2) == 0) ? mt2Var2.f25200f : ((qx0) mt2Var2).f28863p;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final i24 m10669j(String str, zc6 zc6Var, g24[] g24VarArr, yp1 yp1Var) {
        if (hd4.m6345k0(str)) {
            C1077qn.m9987m("Blank serial names are prohibited");
            return null;
        }
        if (zc6Var.equals(rd4.f29188j)) {
            C1077qn.m9987m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        s90 s90Var = new s90();
        s90Var.f29998a = str;
        s90Var.f29999b = v71.f32439a;
        ArrayList arrayList = new ArrayList();
        s90Var.f30000c = arrayList;
        s90Var.f30001d = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        s90Var.f30002e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        s90Var.f30003f = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        s90Var.f30004g = arrayList4;
        VarHandle.storeStoreFence();
        yp1Var.invoke(s90Var);
        int size = arrayList.size();
        List listM9215j0 = AbstractC0990oo.m9215j0(g24VarArr);
        i24 i24Var = new i24();
        i24Var.f21064a = str;
        i24Var.f21065b = zc6Var;
        i24Var.f21066c = size;
        i24Var.f21067d = s90Var.f29999b;
        HashSet hashSet = new HashSet(fq2.m5779K(ib0.m6717y0(arrayList, 12)));
        hb0.m6318d1(arrayList, hashSet);
        i24Var.f21068e = hashSet;
        int i = 0;
        i24Var.f21069f = (String[]) arrayList.toArray(new String[0]);
        i24Var.f21070g = n40.m8501k(arrayList2);
        i24Var.f21071h = (List[]) arrayList3.toArray(new List[0]);
        boolean[] zArr = new boolean[arrayList4.size()];
        int size2 = arrayList4.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList4.get(i2);
            i2++;
            zArr[i] = ((Boolean) obj).booleanValue();
            i++;
        }
        i24Var.f21072i = zArr;
        String[] strArr = i24Var.f21069f;
        C1053q c1053q = new C1053q((byte) 8);
        c1053q.f28113b = strArr;
        VarHandle.storeStoreFence();
        C1041po c1041po = new C1041po(c1053q);
        ArrayList arrayList5 = new ArrayList(ib0.m6717y0(c1041po, 10));
        Iterator it = c1041po.iterator();
        while (true) {
            f41 f41Var = (f41) it;
            if (!f41Var.f18743b.hasNext()) {
                i24Var.f21073j = eq2.m5277P(arrayList5);
                i24Var.f21074k = n40.m8501k(listM9215j0);
                g32 g32Var = new g32((byte) 24);
                g32Var.f19558b = i24Var;
                VarHandle.storeStoreFence();
                i24Var.f21075l = new dg4(g32Var);
                VarHandle.storeStoreFence();
                return i24Var;
            }
            m22 m22Var = (m22) f41Var.next();
            arrayList5.add(new l73(m22Var.f24598b, Integer.valueOf(m22Var.f24597a)));
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m10671l(WorkDatabase workDatabase, ik0 ik0Var, x15 x15Var) {
        int i;
        ArrayList arrayListM7699b0 = kx5.m7699b0(x15Var);
        int i2 = 0;
        while (!arrayListM7699b0.isEmpty()) {
            List list = ((x15) mb0.m8263D0(arrayListM7699b0)).f33928b;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((i43) it.next()).f21125b.f28171j.f22390i.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        WorkDatabase workDatabase2 = workDatabase.mo3080w().f31629a;
        ro4 ro4Var = new ro4((byte) 25);
        VarHandle.storeStoreFence();
        int iIntValue = ((Number) as4.m3231J(workDatabase2, true, false, ro4Var)).intValue();
        byte b = ik0Var.f21512i;
        if (iIntValue + i2 <= b) {
            return;
        }
        C1077qn.m9987m(c75.m3880l(zi4.m13624x("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", b, ";\nalready enqueued count: ", iIntValue, ";\ncurrent enqueue operation count: "), i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    /* JADX INFO: renamed from: m */
    public static final void m10672m(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    zi4.m13626z(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    se0.m10720f(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                ds3.m4665g();
                return;
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static double m10673n(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX INFO: renamed from: o */
    public static float m10674o(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: p */
    public static int m10675p(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: q */
    public static long m10676q(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* JADX INFO: renamed from: r */
    public static long m10677r(long j, mo2 mo2Var) {
        long j2 = mo2Var.f25082b;
        long j3 = mo2Var.f25081a;
        if (!mo2Var.isEmpty()) {
            if (j < Long.valueOf(j3).longValue()) {
                return Long.valueOf(j3).longValue();
            }
            return j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + mo2Var + '.');
    }

    /* JADX INFO: renamed from: s */
    public static Comparable m10678s(Comparable comparable, ma0 ma0Var) {
        float f = ma0Var.f24779b;
        float f2 = ma0Var.f24778a;
        if (ma0Var.m8257b()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + ma0Var + '.');
        }
        if (!ma0.m8255c(comparable, Float.valueOf(f2)) || ma0.m8255c(Float.valueOf(f2), comparable)) {
            return (!ma0.m8255c(Float.valueOf(f), comparable) || ma0.m8255c(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
        }
        return Float.valueOf(f2);
    }

    /* JADX INFO: renamed from: t */
    public static final long m10679t(int i, long j) {
        int i2 = ql4.f28557c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m10657b(i4, i);
    }

    /* JADX INFO: renamed from: u */
    public static final Object m10680u(ra4 ra4Var, int i) {
        Object obj;
        int iM10024h = qq2.m10024h(ra4Var.f29119a, ra4Var.f29121c, i);
        if (iM10024h < 0 || (obj = ra4Var.f29120b[iM10024h]) == f30170g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m10681v(List list) {
        w30 w30Var = new w30();
        ArrayList arrayListM10665f = m10665f(list);
        int size = arrayListM10665f.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM10665f.get(i);
            i++;
            String str = (String) obj;
            w30Var.m12054O(str.length());
            w30Var.m12058S(str);
        }
        return w30Var.m12068t(w30Var.f33056b);
    }

    /* JADX INFO: renamed from: w */
    public static double m10682w(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double dM10664e0 = m10664e0(d);
        double d3 = ((dM10664e0 + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double dM10647S = m10647S(dM10664e0, d3);
        double dAbs = Math.abs(dM10647S - d2);
        if (dM10647S < d2 && dAbs > 0.04d) {
            return -1.0d;
        }
        double dM10636H = ((m10636H(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (dM10636H < 0.0d || dM10636H > 100.0d) {
            return -1.0d;
        }
        return dM10636H;
    }

    /* JADX INFO: renamed from: x */
    public static s50 m10683x(String str) {
        if (str.length() % 2 != 0) {
            C1077qn.m9988n("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (qs5.m10112q(str.charAt(i2 + 1)) + (qs5.m10112q(str.charAt(i2)) << 4));
        }
        return new s50(bArr);
    }

    /* JADX INFO: renamed from: y */
    public static int m10684y(double d) {
        double d2 = d / 100.0d;
        return (int) m10673n(Math.rint((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0.0d, 255.0d);
    }

    /* JADX INFO: renamed from: z */
    public static final void m10685z(i92 i92Var, m62 m62Var, jc2 jc2Var, Object obj) {
        new xc4(new li0(m62Var), i92Var, bk2.OBJ, new ha2[bk2.f15360h.mo103a()]).mo5920d(jc2Var, obj);
    }
}
