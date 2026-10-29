package p000;

import ads_mobile_sdk.c93;
import ads_mobile_sdk.su1;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.provider.Settings;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class n40 {

    /* JADX INFO: renamed from: a */
    public static final C0528ci f25430a = new C0528ci();

    /* JADX INFO: renamed from: b */
    public static final pg0 f25431b = new pg0(518764558, false, new qg0(24));

    /* JADX INFO: renamed from: c */
    public static final pg0 f25432c = new pg0(-145227760, false, new qg0(25));

    /* JADX INFO: renamed from: d */
    public static final pg0 f25433d = new pg0(1102149623, false, new qg0(26));

    /* JADX INFO: renamed from: e */
    public static final pg0 f25434e = new pg0(-1339308167, false, new qg0(27));

    /* JADX INFO: renamed from: f */
    public static final pg0 f25435f = new pg0(648595614, false, new xg0(27));

    /* JADX INFO: renamed from: g */
    public static final g24[] f25436g = new g24[0];

    /* JADX INFO: renamed from: h */
    public static final z45 f25437h = new z45(27);

    /* JADX INFO: renamed from: i */
    public static g12 f25438i;

    public n40(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        x70.m12516a(bArr);
    }

    /* JADX INFO: renamed from: A */
    public static final C1079qp m8490A(InputStream inputStream) {
        return new C1079qp(inputStream, new ym4());
    }

    /* JADX INFO: renamed from: B */
    public static final nt2 m8491B(nt2 nt2Var, boolean z, nv2 nv2Var, jq3 jq3Var, boolean z2, lq3 lq3Var, yp1 yp1Var) {
        nt2 nt2VarM10029m;
        if (jq3Var != null) {
            nt2VarM10029m = new in4(z, nv2Var, jq3Var, z2, lq3Var, yp1Var);
        } else if (jq3Var == null) {
            nt2VarM10029m = new in4(z, nv2Var, null, z2, lq3Var, yp1Var);
        } else {
            kt2 kt2Var = kt2.f23428a;
            if (nv2Var != null) {
                nt2VarM10029m = n22.m8478a(kt2Var, nv2Var, jq3Var).mo7630d(new in4(z, nv2Var, null, z2, lq3Var, yp1Var));
            } else {
                jn4 jn4Var = new jn4();
                jn4Var.f22451a = jq3Var;
                jn4Var.f22452b = z;
                jn4Var.f22453c = z2;
                jn4Var.f22454d = lq3Var;
                jn4Var.f22455e = yp1Var;
                VarHandle.storeStoreFence();
                nt2VarM10029m = qq2.m10029m(kt2Var, jn4Var);
            }
        }
        return nt2Var.mo7630d(nt2VarM10029m);
    }

    /* JADX INFO: renamed from: a */
    public static final void m8492a(en3 en3Var, nt2 nt2Var, boolean z, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        ir1 ir1Var;
        Object obj;
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6889f0(72363539);
        int i2 = (ir1Var2.m6890g(en3Var) ? 4 : 2) | i | 432;
        boolean z2 = true;
        if (ir1Var2.m6871T(i2 & 1, (i2 & 147) != 146)) {
            lv1 lv1Var = (lv1) ir1Var2.m6898k(nv1.f26110a);
            nt2Var2 = kt2.f23428a;
            nt2 nt2VarM8579g = n74.m8579g(nt2Var2, 40.0f);
            boolean zM6890g = ir1Var2.m6890g(lv1Var);
            Object objM6869O = ir1Var2.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1127s c1127s = new C1127s((byte) 23);
                c1127s.f29778b = lv1Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c1127s);
                obj = c1127s;
            }
            obj = objM6869O;
            b41 b41Var = b41.f15074l;
            ig1 ig1Var = ig1.f21396t;
            en3Var.getClass();
            nt2 nt2VarM10029m = qq2.m10029m(nt2VarM8579g, new C1294wi(en3Var, ig1Var, (yp1) obj, b41Var, (byte) 1));
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            int iHashCode = Long.hashCode(ir1Var2.f21683T);
            ga3 ga3VarM6902m = ir1Var2.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarM10029m);
            bi0.f15310ap.getClass();
            if (ir1Var2.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var2.m6893h0();
            if (ir1Var2.f21682S) {
                ir1Var2.m6900l(wf2.f33290T);
            } else {
                ir1Var2.m6911q0();
            }
            C0006a5.m53I(ir1Var2, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var2);
            C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
            ir1 ir1Var3 = ir1Var2;
            l02.m7759a((g12) o02.f26253j.getValue(), null, 0L, ir1Var3, 48, 12);
            ir1Var3.m6912r(true);
            ir1Var = ir1Var3;
        } else {
            ir1 ir1Var4 = ir1Var2;
            ir1Var4.m6874W();
            nt2Var2 = nt2Var;
            z2 = z;
            ir1Var = ir1Var4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ae0 ae0Var = new ae0((byte) 3);
            ae0Var.f14401c = en3Var;
            ae0Var.f14402d = nt2Var2;
            ae0Var.f14400b = z2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ae0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static vt1 m8493b(f70 f70Var, ut1 ut1Var, xm1 xm1Var, int i) {
        wm1 wm1Var = new wm1();
        List listM9215j0 = AbstractC0990oo.m9215j0(new vm1[0]);
        wm1Var.f33488a = listM9215j0;
        VarHandle.storeStoreFence();
        if (listM9215j0.size() > 1 && listM9215j0.size() - 1 > 0) {
            listM9215j0.get(0).getClass();
            xy4.m12778e();
            return null;
        }
        gb5 gb5Var = gb5.f19715f;
        vt1 vt1Var = new vt1();
        vt1Var.f32852a = (byte) 2;
        vt1Var.f32853b = gb5Var;
        vt1Var.f32854c = wm1Var;
        vt1Var.f32855d = ut1Var;
        vt1Var.f32856e = xm1Var;
        vt1Var.f32857f = i;
        vt1Var.f32858g = wm1Var;
        VarHandle.storeStoreFence();
        return vt1Var;
    }

    /* JADX INFO: renamed from: c */
    public static C1013ox m8494c(boolean z) {
        if (!z) {
            return C1087qx.f28856d;
        }
        C1013ox c1013ox = C1087qx.f28857e;
        return c1013ox.f28860b == null ? c1013ox : new C1013ox(c1013ox.f28859a, (Character) null);
    }

    /* JADX INFO: renamed from: d */
    public static final c93 m8495d(ba2 ba2Var) {
        if (!(ba2Var instanceof o92)) {
            return null;
        }
        ArrayList arrayList = ba2Var.m3527g().f26491a;
        if (arrayList.isEmpty()) {
            return null;
        }
        ba2 ba2Var2 = (ba2) arrayList.get(0);
        ba2Var2.getClass();
        if (!(ba2Var2 instanceof wa2)) {
            return null;
        }
        wa2 wa2VarM3528l = ba2Var2.m3528l();
        su1 su1Var = su1.f11748a;
        String strM2258a = su1.m2258a(wa2VarM3528l, "rb_type", "");
        int iM2255a = su1.m2255a(wa2VarM3528l, "rb_amount", 1);
        c93 c93Var = new c93();
        c93Var.f1870a = iM2255a;
        c93Var.f1871b = strM2258a;
        VarHandle.storeStoreFence();
        return c93Var;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m8496e(String str, boolean z) {
        byte[] bArrM10149a = m8494c(z).m10149a(str);
        if (bArrM10149a.length != 0 || str.length() <= 0) {
            return bArrM10149a;
        }
        C1077qn.m9987m("Unable to decode ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static IOException m8497f(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "]");
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    /* JADX INFO: renamed from: g */
    public static IOException m8498g(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m8497f(file, iOException);
        }
        if (!parentFile.exists()) {
            return m8497f(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? m8497f(file, iOException) : m8497f(file, iOException);
            }
            return parentFile.canWrite() ? m8497f(file, iOException) : m8497f(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? m8497f(file, iOException) : m8497f(file, iOException);
        }
        return parentFile.canWrite() ? m8497f(file, iOException) : m8497f(file, iOException);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m8499h(gk2 gk2Var, ym0 ym0Var) throws Throwable {
        C0509c c0509c;
        gk2 gk2Var2;
        ql3 ql3Var;
        Throwable th;
        kk2 kk2Var;
        kk2 kk2Var2;
        if (ym0Var instanceof C0509c) {
            c0509c = (C0509c) ym0Var;
            int i = c0509c.f15719w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0509c.f15719w = i - Integer.MIN_VALUE;
            } else {
                c0509c = new C0509c(ym0Var);
            }
        } else {
            c0509c = new C0509c(ym0Var);
        }
        Object obj = c0509c.f15718v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0509c.f15719w;
        ju4 ju4Var = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (!gk2Var.mo6016b().m5728a(fk2.f19057d)) {
                ql3 ql3Var2 = new ql3();
                try {
                    c0509c.f15716t = gk2Var;
                    c0509c.f15717u = ql3Var2;
                    c0509c.f15719w = 1;
                    b70 b70Var = new b70(1, C0006a5.m86x(c0509c));
                    b70Var.m3497u();
                    C0557d c0557d = new C0557d();
                    c0557d.f16653a = b70Var;
                    VarHandle.storeStoreFence();
                    ql3Var2.f28555a = c0557d;
                    gk2Var.mo6015a(c0557d);
                    if (b70Var.m3495r() == ap0Var) {
                        return ap0Var;
                    }
                    gk2Var2 = gk2Var;
                    ql3Var = ql3Var2;
                    kk2Var2 = (kk2) ql3Var.f28555a;
                    if (kk2Var2 != null) {
                        gk2Var2.mo6017c(kk2Var2);
                    }
                } catch (Throwable th2) {
                    gk2Var2 = gk2Var;
                    ql3Var = ql3Var2;
                    th = th2;
                    kk2Var = (kk2) ql3Var.f28555a;
                    if (kk2Var != null) {
                        gk2Var2.mo6017c(kk2Var);
                    }
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql3Var = c0509c.f15717u;
            gk2Var2 = c0509c.f15716t;
            try {
                k43.m7376J(obj);
                kk2Var2 = (kk2) ql3Var.f28555a;
                if (kk2Var2 != null) {
                    gk2Var2.mo6017c(kk2Var2);
                }
            } catch (Throwable th3) {
                th = th3;
                kk2Var = (kk2) ql3Var.f28555a;
                if (kk2Var != null) {
                    gk2Var2.mo6017c(kk2Var);
                }
                throw th;
            }
        }
        return ju4Var;
    }

    /* JADX INFO: renamed from: i */
    public static final Set m8500i(g24 g24Var) {
        if (g24Var instanceof f60) {
            return ((f60) g24Var).mo4434g();
        }
        HashSet hashSet = new HashSet(g24Var.mo4432d());
        int iMo4432d = g24Var.mo4432d();
        for (int i = 0; i < iMo4432d; i++) {
            hashSet.add(g24Var.mo4433e(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k */
    public static final g24[] m8501k(List list) {
        g24[] g24VarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (g24VarArr = (g24[]) list.toArray(new g24[0])) == null) ? f25436g : g24VarArr;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m8502l(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m8502l(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public static final Object m8503m(xc3 xc3Var, String str, ym0 ym0Var) {
        Object objMo2968a = xc3Var.mo2968a(str, new ro4((byte) 0), ym0Var);
        return objMo2968a == ap0.f14763a ? objMo2968a : ju4.f22634a;
    }

    /* JADX INFO: renamed from: n */
    public static dc0 m8504n(mi0 mi0Var) {
        return ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24277a;
    }

    /* JADX INFO: renamed from: o */
    public static lu2 m8505o(ir1 ir1Var) {
        return ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
    }

    /* JADX INFO: renamed from: p */
    public static final ViewParent m8506p(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(C0995R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final zc3 m8507q(View view) {
        zc3 zc3Var = (zc3) view.getTag(C0995R.id.pooling_container_listener_holder_tag);
        if (zc3Var != null) {
            return zc3Var;
        }
        zc3 zc3Var2 = new zc3();
        zc3Var2.f35980a = new ArrayList();
        VarHandle.storeStoreFence();
        view.setTag(C0995R.id.pooling_container_listener_holder_tag, zc3Var2);
        return zc3Var2;
    }

    /* JADX INFO: renamed from: r */
    public static er3 m8508r(Display display, int i) {
        int i2;
        RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C1077qn.m9987m(c75.m3877i(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        int radius = roundedCorner.getRadius();
        Point center = roundedCorner.getCenter();
        int i3 = center.x;
        int i4 = center.y;
        er3 er3Var = new er3();
        er3Var.f18419a = i2;
        er3Var.f18420b = radius;
        er3Var.f18421c = new Point(i3, i4);
        VarHandle.storeStoreFence();
        return er3Var;
    }

    /* JADX INFO: renamed from: s */
    public static final void m8509s(ro0 ro0Var, Throwable th) {
        if (th instanceof e01) {
            th = ((e01) th).f17555a;
        }
        try {
            to0 to0Var = (to0) ro0Var.get(wv1.f33762e);
            if (to0Var != null) {
                to0Var.handleException(ro0Var, th);
            } else {
                i20.m6598w(ro0Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                se0.m10720f(runtimeException, th);
                th = runtimeException;
            }
            i20.m6598w(ro0Var, th);
        }
    }

    /* JADX INFO: renamed from: t */
    public static nt2 m8510t(nt2 nt2Var, nv2 nv2Var) {
        ox1 ox1Var = new ox1();
        ox1Var.f27186a = nv2Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(ox1Var);
    }

    /* JADX INFO: renamed from: u */
    public static final void m8511u(gy4 gy4Var, wf2 wf2Var) {
        long jMo4005S = ((w32) wf2Var.f33299G.f25607d).mo4005S(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo4005S >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo4005S & 4294967295L)));
        gy4Var.layout(iRound, iRound2, gy4Var.getMeasuredWidth() + iRound, gy4Var.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: v */
    public static List m8512v(p84 p84Var, int i, p84 p84Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iM9431t = p84Var.m9431t(i);
        int i2 = i + iM9431t;
        int iM9418f = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(i));
        int iM9418f2 = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(i2));
        int i3 = iM9418f2 - iM9418f;
        boolean z5 = i >= 0 && (p84Var.f27434b[(p84Var.m9428q(i) * 5) + 1] & 201326592) != 0;
        p84Var2.m9433v(iM9431t);
        p84Var2.m9434w(i3, p84Var2.f27452t);
        if (p84Var.f27439g < i2) {
            p84Var.m9390A(i2);
        }
        if (p84Var.f27443k < iM9418f2) {
            p84Var.m9391B(iM9418f2, i2);
        }
        int[] iArr = p84Var2.f27434b;
        int i4 = p84Var2.f27452t;
        int i5 = i4 * 5;
        AbstractC0990oo.m9199T(p84Var.f27434b, iArr, i5, i * 5, i2 * 5);
        Object[] objArr = p84Var2.f27435c;
        int i6 = p84Var2.f27441i;
        System.arraycopy(p84Var.f27435c, iM9418f, objArr, i6, i3);
        int i7 = p84Var2.f27454v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iM9431t;
        int iM9418f3 = i6 - p84Var2.m9418f(iArr, i4);
        int i10 = p84Var2.f27445m;
        int i11 = p84Var2.f27444l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = p84.m9388h(p84Var2.m9418f(iArr, i13) + iM9418f3, i12 < i13 ? 0 : p84Var2.f27443k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        p84Var2.f27445m = i12;
        int iM8982c = o84.m8982c(p84Var.f27436d, i, p84Var.m9426o());
        int iM8982c2 = o84.m8982c(p84Var.f27436d, i2, p84Var.m9426o());
        if (iM8982c < iM8982c2) {
            ArrayList arrayList = p84Var.f27436d;
            ArrayList arrayList2 = new ArrayList(iM8982c2 - iM8982c);
            for (int i15 = iM8982c; i15 < iM8982c2; i15++) {
                cr1 cr1Var = (cr1) arrayList.get(i15);
                cr1Var.f16390a += i8;
                arrayList2.add(cr1Var);
            }
            p84Var2.f27436d.addAll(o84.m8982c(p84Var2.f27436d, p84Var2.f27452t, p84Var2.m9426o()), arrayList2);
            arrayList.subList(iM8982c, iM8982c2).clear();
            list = arrayList2;
        } else {
            list = v71.f32439a;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = p84Var.f27437e;
            HashMap map2 = p84Var2.f27437e;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = p84Var2.f27454v;
        p84Var2.m9405P(i7);
        int iM9395F = p84Var.m9395F(p84Var.f27434b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM9395F >= 0;
            if (z7) {
                p84Var.m9406Q();
                p84Var.m9413a(iM9395F - p84Var.f27452t);
                p84Var.m9406Q();
            }
            p84Var.m9413a(i - p84Var.f27452t);
            boolean zM9398I = p84Var.m9398I();
            if (z7) {
                p84Var.m9403N();
                p84Var.m9420i();
                p84Var.m9403N();
                p84Var.m9420i();
            }
            z4 = zM9398I;
        } else {
            boolean zM9399J = p84Var.m9399J(i, iM9431t);
            p84Var.m9400K(iM9418f, i3, i - 1);
            z4 = zM9399J;
        }
        if (z4) {
            qi0.m9889a("Unexpectedly removed anchors");
        }
        int i18 = p84Var2.f27447o;
        int i19 = iArr3[i5 + 1];
        p84Var2.f27447o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            p84Var2.f27452t = i9;
            p84Var2.f27441i = i6 + i3;
        }
        if (z6) {
            p84Var2.m9411V(i7);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [wv3] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, z64] */
    /* JADX INFO: renamed from: w */
    public static final wv3 m8513w(q50 q50Var, List list, List list2, List list3) {
        int size = list2.size();
        int i = 0;
        boolean z = false;
        ?? z64Var = 0;
        int i2 = 0;
        while (i2 < size) {
            ((yz2) list2.get(i2)).getClass();
            ny2 ny2Var = (ny2) hb0.m6307S0(list);
            if (ny2Var != null && ny2Var.f26196c.containsKey("sheet")) {
                List listM6296H0 = hb0.m6296H0(list);
                xz2 xz2Var = new xz2();
                xz2Var.f34736a = ny2Var.f26195b;
                xz2Var.f34737b = listM6296H0;
                xz2Var.f34738c = listM6296H0;
                xz2Var.f34739d = Collections.singletonList(ny2Var);
                vz2 vz2Var = new vz2(z ? 1 : 0);
                vz2Var.f32984b = ny2Var;
                vz2Var.f32985c = xz2Var;
                VarHandle.storeStoreFence();
                xz2Var.f34741f = new pg0(-210882874, true, vz2Var);
                VarHandle.storeStoreFence();
                z64Var = xz2Var;
            } else {
                z64Var = 0;
            }
            if (z64Var != 0) {
                break;
            }
            i2++;
            z64Var = z64Var;
        }
        if (z64Var == 0) {
            Object obj = ((ny2) hb0.m6306R0(list)).f26195b;
            ny2 ny2Var2 = (ny2) hb0.m6306R0(list);
            List listM6296H1 = hb0.m6296H0(list);
            z64Var = new z64();
            z64Var.f35793a = obj;
            z64Var.f35794b = ny2Var2;
            z64Var.f35795c = listM6296H1;
            z64Var.f35796d = Collections.singletonList(ny2Var2);
            u04 u04Var = new u04((byte) 3);
            u04Var.f31581b = z64Var;
            VarHandle.storeStoreFence();
            z64Var.f35797e = new pg0(-322904035, true, u04Var);
            VarHandle.storeStoreFence();
        }
        int size2 = list3.size();
        ?? r3 = z64Var;
        while (i < size2) {
            if (list3.get(i) != null) {
                xy4.m12778e();
                return null;
            }
            xz2 xz2Var2 = r3 instanceof xz2 ? (xz2) r3 : null;
            xz2Var2.getClass();
            i++;
            r3 = xz2Var2;
        }
        return r3;
    }

    /* JADX INFO: renamed from: x */
    public static th4 m8514x(ve4 ve4Var, String str) {
        long j;
        Map mapM10893b;
        t34 t34Var;
        gf4 gf4VarM11888b = ve4Var.m11888b("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (gf4VarM11888b.mo5112g()) {
                int iM13535u = zc6.m13535u(gf4VarM11888b, "name");
                int iM13535u2 = zc6.m13535u(gf4VarM11888b, "type");
                int iM13535u3 = zc6.m13535u(gf4VarM11888b, "notnull");
                int iM13535u4 = zc6.m13535u(gf4VarM11888b, "pk");
                int iM13535u5 = zc6.m13535u(gf4VarM11888b, "dflt_value");
                sp2 sp2Var = new sp2();
                while (true) {
                    String strMo5110b = gf4VarM11888b.mo5110b(iM13535u);
                    j = j2;
                    sp2Var.put(strMo5110b, new qh4(strMo5110b, gf4VarM11888b.mo5110b(iM13535u2), gf4VarM11888b.getLong(iM13535u3) != j2, (int) gf4VarM11888b.getLong(iM13535u4), gf4VarM11888b.isNull(iM13535u5) ? null : gf4VarM11888b.mo5110b(iM13535u5), 2));
                    if (!gf4VarM11888b.mo5112g()) {
                        break;
                    }
                    j2 = j;
                }
                mapM10893b = sp2Var.m10893b();
                sc6.m10672m(gf4VarM11888b, null);
            } else {
                mapM10893b = w71.f33134a;
                sc6.m10672m(gf4VarM11888b, null);
                j = 0;
            }
            gf4 gf4VarM11888b2 = ve4Var.m11888b("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iM13535u6 = zc6.m13535u(gf4VarM11888b2, "id");
                int iM13535u7 = zc6.m13535u(gf4VarM11888b2, "seq");
                int iM13535u8 = zc6.m13535u(gf4VarM11888b2, "table");
                int iM13535u9 = zc6.m13535u(gf4VarM11888b2, "on_delete");
                int iM13535u10 = zc6.m13535u(gf4VarM11888b2, "on_update");
                List listM13660L = zp0.m13660L(gf4VarM11888b2);
                gf4VarM11888b2.mo5111e();
                t34 t34Var2 = new t34();
                while (gf4VarM11888b2.mo5112g()) {
                    if (gf4VarM11888b2.getLong(iM13535u7) == j) {
                        int i = (int) gf4VarM11888b2.getLong(iM13535u6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iM13535u6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listM13660L) {
                            int i3 = iM13535u7;
                            List list = listM13660L;
                            if (((en1) obj).f18268a == i) {
                                arrayList3.add(obj);
                            }
                            iM13535u7 = i3;
                            listM13660L = list;
                        }
                        int i4 = iM13535u7;
                        List list2 = listM13660L;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            en1 en1Var = (en1) obj2;
                            arrayList.add(en1Var.f18270c);
                            arrayList2.add(en1Var.f18271d);
                            arrayList3 = arrayList3;
                        }
                        t34Var2.add(new rh4(gf4VarM11888b2.mo5110b(iM13535u8), gf4VarM11888b2.mo5110b(iM13535u9), gf4VarM11888b2.mo5110b(iM13535u10), arrayList, arrayList2));
                        iM13535u6 = i2;
                        iM13535u7 = i4;
                        listM13660L = list2;
                    }
                }
                t34 t34VarM11847f = vd6.m11847f(t34Var2);
                sc6.m10672m(gf4VarM11888b2, null);
                gf4 gf4VarM11888b3 = ve4Var.m11888b("PRAGMA index_list(`" + str + "`)");
                try {
                    int iM13535u11 = zc6.m13535u(gf4VarM11888b3, "name");
                    int iM13535u12 = zc6.m13535u(gf4VarM11888b3, "origin");
                    int iM13535u13 = zc6.m13535u(gf4VarM11888b3, "unique");
                    if (iM13535u11 == -1 || iM13535u12 == -1 || iM13535u13 == -1) {
                        sc6.m10672m(gf4VarM11888b3, null);
                        t34Var = null;
                    } else {
                        t34 t34Var3 = new t34();
                        while (gf4VarM11888b3.mo5112g()) {
                            if ("c".equals(gf4VarM11888b3.mo5110b(iM13535u12))) {
                                sh4 sh4VarM13661M = zp0.m13661M(ve4Var, gf4VarM11888b3.mo5110b(iM13535u11), gf4VarM11888b3.getLong(iM13535u13) == 1);
                                if (sh4VarM13661M == null) {
                                    sc6.m10672m(gf4VarM11888b3, null);
                                    t34Var = null;
                                } else {
                                    t34Var3.add(sh4VarM13661M);
                                }
                            }
                        }
                        t34 t34VarM11847f2 = vd6.m11847f(t34Var3);
                        sc6.m10672m(gf4VarM11888b3, null);
                        t34Var = t34VarM11847f2;
                    }
                    return new th4(str, mapM10893b, t34VarM11847f, t34Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        sc6.m10672m(gf4VarM11888b3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    sc6.m10672m(gf4VarM11888b2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                sc6.m10672m(gf4VarM11888b, th5);
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final C1367yg m8515y(String str, EnumC1070qg enumC1070qg, Integer num, mi0 mi0Var) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object objInvoke;
        Object obj;
        ContentResolver contentResolver = ((Context) ((ir1) mi0Var).m6898k(AndroidCompositionLocals_androidKt.f14651b)).getContentResolver();
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new sg0((byte) 4);
            ir1Var.m6905n0(objM6869O);
        }
        mq1 mq1Var = (mq1) objM6869O;
        ir1 ir1Var2 = (ir1) mi0Var;
        l84 l84Var = ir1Var2.f21670G;
        int i = l84Var.f23853g;
        Object objM6097v = gq6.m6097v(i < l84Var.f23854h ? l84Var.m7860p(l84Var.f23848b, i) : null, str, enumC1070qg);
        if (objM6097v == null) {
            objM6097v = new g92(str, enumC1070qg);
        }
        l84 l84Var2 = ir1Var2.f21670G;
        int i2 = l84Var2.f23853g;
        Object objM6097v2 = gq6.m6097v(i2 < l84Var2.f23854h ? l84Var2.m7860p(l84Var2.f23848b, i2) : null, objM6097v, num);
        if (objM6097v2 == null) {
            objM6097v2 = new g92(objM6097v, num);
        }
        ir1Var2.m6879a0(1578043193, objM6097v2);
        Object objM6869O2 = ir1Var2.m6869O();
        if (objM6869O2 == i50Var) {
            int iOrdinal = enumC1070qg.ordinal();
            if (iOrdinal == 0) {
                obj = Settings.Global.class;
            } else if (iOrdinal == 1) {
                obj = Settings.Secure.class;
            } else {
                if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return null;
                }
                obj = Settings.System.class;
            }
            objM6869O2 = obj;
            ir1Var2.m6905n0(objM6869O2);
        }
        Class cls = (Class) objM6869O2;
        Object objM6869O3 = ir1Var2.m6869O();
        if (objM6869O3 == i50Var) {
            objM6869O3 = "Int";
            ir1Var2.m6905n0("Int");
        }
        String str2 = (String) objM6869O3;
        Class cls2 = Integer.TYPE;
        Object objM6869O4 = ir1Var2.m6869O();
        if (objM6869O4 == i50Var) {
            objM6869O4 = cls2.equals(String.class) ? cls.getMethod(zi4.m13620t("get", str2), ContentResolver.class, String.class) : cls.getMethod(zi4.m13620t("get", str2), ContentResolver.class, String.class, cls2);
            ir1Var2.m6905n0(objM6869O4);
        }
        Method method = (Method) objM6869O4;
        Object objM6869O5 = ir1Var2.m6869O();
        if (objM6869O5 == i50Var) {
            objM6869O5 = cls.getMethod(zi4.m13620t("put", str2), ContentResolver.class, String.class, cls2);
            ir1Var2.m6905n0(objM6869O5);
        }
        Method method2 = (Method) objM6869O5;
        Object objM6869O6 = ir1Var2.m6869O();
        if (objM6869O6 == i50Var) {
            objM6869O6 = cls.getMethod("getUriFor", String.class);
            ir1Var2.m6905n0(objM6869O6);
        }
        Method method3 = (Method) objM6869O6;
        Object objM6869O7 = ir1Var2.m6869O();
        if (objM6869O7 == i50Var) {
            objM6869O7 = lb5.m7942w(r71.f29063a, ir1Var2);
            ir1Var2.m6905n0(objM6869O7);
        }
        zo0 zo0Var = (zo0) objM6869O7;
        C0459am c0459am = (C0459am) ir1Var2.m6898k(AbstractC0496bm.m3626a());
        Object objM6869O8 = ir1Var2.m6869O();
        if (objM6869O8 == i50Var) {
            objM6869O8 = hx2.m6530a();
            ir1Var2.m6905n0(objM6869O8);
        }
        gx2 gx2Var = (gx2) objM6869O8;
        Object objM6869O9 = ir1Var2.m6869O();
        Object obj2 = objM6869O9;
        if (objM6869O9 == i50Var) {
            C1367yg c1367yg = new C1367yg();
            c1367yg.f35203b = contentResolver;
            c1367yg.f35204c = str;
            c1367yg.f35205d = zo0Var;
            c1367yg.f35206e = c0459am;
            c1367yg.f35207f = gx2Var;
            c1367yg.f35208g = method2;
            c1367yg.f35209h = mq1Var;
            if (cls2.equals(String.class)) {
                objInvoke = method.invoke(null, contentResolver, str);
                if (objInvoke == null) {
                    objInvoke = num;
                }
            } else {
                objInvoke = method.invoke(null, contentResolver, str, num);
            }
            c1367yg.f35202a = k43.m7398w(objInvoke);
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c1367yg);
            obj2 = c1367yg;
        }
        C1367yg c1367yg2 = (C1367yg) obj2;
        boolean zM6890g = ir1Var2.m6890g(zo0Var) | ir1Var2.m6890g(c0459am) | ir1Var2.m6894i(cls2) | ir1Var2.m6894i(method) | ir1Var2.m6894i(contentResolver) | ir1Var2.m6894i(method3);
        Object objM6869O10 = ir1Var2.m6869O();
        byte b = 0;
        Object obj3 = objM6869O10;
        if (zM6890g || objM6869O10 == i50Var) {
            C1181tg c1181tg = new C1181tg(b);
            c1181tg.f31131b = contentResolver;
            c1181tg.f31132c = method3;
            c1181tg.f31134e = str;
            c1181tg.f31135f = zo0Var;
            c1181tg.f31136g = c1367yg2;
            c1181tg.f31137h = c0459am;
            c1181tg.f31138i = cls2;
            c1181tg.f31133d = method;
            c1181tg.f31139j = num;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c1181tg);
            obj3 = c1181tg;
        }
        lb5.m7923d(ju4.f22634a, (yp1) obj3, ir1Var2);
        ir1Var2.m6912r(false);
        return c1367yg2;
    }

    /* JADX INFO: renamed from: z */
    public static final mh0 m8516z(fk2 fk2Var, mi0 mi0Var) {
        lk2 lk2Var = (lk2) ((ir1) mi0Var).m6898k(rm2.f29413a);
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(lk2Var);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (zM6890g || objM6869O == i50Var) {
            mh0 mh0Var = new mh0();
            mh0Var.f24910a = new ok2(mh0Var, true);
            fk2 fk2Var2 = fk2.f19055b;
            mh0Var.f24911b = fk2Var2;
            mh0Var.f24912c = fk2Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(mh0Var);
            obj = mh0Var;
        }
        mh0 mh0Var2 = (mh0) obj;
        boolean zM6894i = ir1Var.m6894i(mh0Var2) | ir1Var.m6894i(lk2Var);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            na1 na1Var = new na1((byte) 25);
            na1Var.f25595b = lk2Var;
            na1Var.f25596c = mh0Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(na1Var);
            obj2 = na1Var;
        }
        lb5.m7924e(mh0Var2, lk2Var, (yp1) obj2, ir1Var);
        boolean zM6894i2 = ir1Var.m6894i(mh0Var2) | ir1Var.m6886e(fk2Var.ordinal());
        Object objM6869O3 = ir1Var.m6869O();
        if (zM6894i2 || objM6869O3 == i50Var) {
            objM6869O3 = new C1260vl(mh0Var2, fk2Var, null, (byte) 11);
            ir1Var.m6905n0(objM6869O3);
        }
        lb5.m7927h(mh0Var2, fk2Var, (mq1) objM6869O3, ir1Var);
        return mh0Var2;
    }

    /* JADX INFO: renamed from: j */
    public abstract List mo4796j(String str, List list);
}
