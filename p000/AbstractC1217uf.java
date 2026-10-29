package p000;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.UUID;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: uf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1217uf {

    /* JADX INFO: renamed from: a */
    public static final kj0 f31816a = as4.m3262u(new C0515c5(7));

    /* JADX INFO: renamed from: b */
    public static final kj0 f31817b = as4.m3262u(new da2(12));

    /* JADX WARN: Code duplicated, block: B:102:0x0312  */
    /* JADX WARN: Code duplicated, block: B:105:0x033b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0342  */
    /* JADX WARN: Code duplicated, block: B:108:0x0348  */
    /* JADX WARN: Code duplicated, block: B:110:0x036b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0371  */
    /* JADX WARN: Code duplicated, block: B:115:0x037a  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0209  */
    /* JADX WARN: Code duplicated, block: B:60:0x020b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0213  */
    /* JADX WARN: Code duplicated, block: B:64:0x0215  */
    /* JADX WARN: Code duplicated, block: B:70:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x0256  */
    /* JADX WARN: Code duplicated, block: B:74:0x0258  */
    /* JADX WARN: Code duplicated, block: B:77:0x025e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0260  */
    /* JADX WARN: Code duplicated, block: B:82:0x0278  */
    /* JADX WARN: Code duplicated, block: B:85:0x029e  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:94:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m11536a(dd3 dd3Var, wp1 wp1Var, ed3 ed3Var, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        wp1 wp1Var2;
        boolean z;
        yk3 yk3VarM6916v;
        View view;
        ky0 ky0Var;
        wm0 wm0Var;
        String str;
        df2 df2Var;
        gr1 gr1VarM4685N;
        sw2 sw2VarM7369C;
        Object objM6869O;
        i50 i50Var;
        UUID uuid;
        boolean zBooleanValue;
        Object objM6869O2;
        byte b;
        Object obj;
        cd3 cd3Var;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean zM6890g;
        df2 df2Var2;
        Object obj2;
        boolean z4;
        boolean z5;
        boolean zM6890g2;
        Object obj3;
        boolean z6;
        boolean z7;
        Object obj4;
        boolean zM6894i;
        Object objM6869O3;
        boolean zM6894i2;
        Object obj5;
        boolean zM6894i3;
        Object obj6;
        xq2 xq2Var;
        int iHashCode;
        ga3 ga3VarM6902m;
        nt2 nt2VarM10006A;
        boolean z8;
        int i6;
        int i7;
        int i8;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(dd3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                wp1Var2 = wp1Var;
                i3 |= ir1Var.m6894i(wp1Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (ir1Var.m6890g(ed3Var)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            }
            if ((i & 3072) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i3 & 1, z)) {
                if (i9 != 0) {
                    wp1Var2 = null;
                }
                view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
                ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
                wm0Var = null;
                str = (String) ir1Var.m6898k(f31816a);
                df2Var = (df2) ir1Var.m6898k(ij0.f21479n);
                gr1VarM4685N = dt0.m4685N(ir1Var);
                sw2VarM7369C = k43.m7369C(pg0Var, ir1Var);
                Object[] objArr = new Object[0];
                objM6869O = ir1Var.m6869O();
                i50Var = ki0.f23136a;
                if (objM6869O == i50Var) {
                    objM6869O = new C0515c5((byte) 8);
                    ir1Var.m6905n0(objM6869O);
                }
                uuid = (UUID) dt0.m4686O(objArr, (wp1) objM6869O, ir1Var, 48);
                zBooleanValue = ((Boolean) ir1Var.m6898k(f31817b)).booleanValue();
                objM6869O2 = ir1Var.m6869O();
                b = 14;
                if (objM6869O2 == i50Var) {
                    f70 f70Var = new f70(b);
                    cd3 cd3Var2 = new cd3(view.getContext());
                    cd3Var2.f15944j = wp1Var2;
                    cd3Var2.f15945k = ed3Var;
                    cd3Var2.f15946l = str;
                    cd3Var2.f15947m = view;
                    cd3Var2.f15948n = zBooleanValue;
                    cd3Var2.f15949o = f70Var;
                    cd3Var2.f15950p = (WindowManager) view.getContext().getSystemService("window");
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.gravity = 8388659;
                    ed3 ed3Var2 = cd3Var2.f15945k;
                    boolean zM11537b = m11537b(view);
                    z8 = ed3Var2.f18018b;
                    i6 = ed3Var2.f18017a;
                    if (!z8 && zM11537b) {
                        i6 |= 8192;
                    } else if (z8 && !zM11537b) {
                        i6 &= -8193;
                    }
                    layoutParams.flags = i6;
                    layoutParams.type = cd3Var2.f15945k.f18022f;
                    layoutParams.token = view.getApplicationWindowToken();
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    layoutParams.format = -3;
                    layoutParams.setTitle(view.getContext().getResources().getString(C0995R.string.default_popup_window_title));
                    cd3Var2.f15951q = layoutParams;
                    cd3Var2.f15952r = dd3Var;
                    cd3Var2.f15953s = df2.f17011a;
                    cd3Var2.f15954t = k43.m7398w(null);
                    cd3Var2.f15955u = k43.m7398w(null);
                    g32 g32Var = new g32((byte) 14);
                    g32Var.f19558b = cd3Var2;
                    VarHandle.storeStoreFence();
                    cd3Var2.f15957w = s94.m10566b(g32Var);
                    cd3Var2.f15958x = new Rect();
                    C0833kf c0833kf = new C0833kf((byte) 2);
                    c0833kf.f23095b = cd3Var2;
                    VarHandle.storeStoreFence();
                    cd3Var2.f15959y = new aa4(c0833kf);
                    cd3Var2.setId(R.id.content);
                    cd3Var2.setTag(C0995R.id.view_tree_lifecycle_owner, zp0.m13694z(view));
                    cd3Var2.setTag(C0995R.id.view_tree_view_model_store_owner, ev0.m5352b0(view));
                    cd3Var2.setTag(C0995R.id.view_tree_saved_state_registry_owner, dt0.m4681D(view));
                    cd3Var2.setTag(C0995R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
                    cd3Var2.setClipChildren(false);
                    cd3Var2.setElevation(ky0Var.mo3575E(8.0f));
                    cd3Var2.setOutlineProvider(new bd3((byte) 0));
                    cd3Var2.f15941A = k43.m7398w(AbstractC0647fd.f18912b);
                    cd3Var2.f15943C = new int[2];
                    VarHandle.storeStoreFence();
                    C0870lf c0870lf = new C0870lf((byte) 0);
                    c0870lf.f23989b = cd3Var2;
                    c0870lf.f23990c = sw2VarM7369C;
                    VarHandle.storeStoreFence();
                    cd3Var2.m3979m(gr1VarM4685N, new pg0(-297523940, true, c0870lf));
                    ir1Var.m6905n0(cd3Var2);
                    obj = cd3Var2;
                } else {
                    obj = objM6869O2;
                }
                cd3Var = (cd3) obj;
                boolean zM6894i4 = ir1Var.m6894i(cd3Var);
                i4 = i3 & 112;
                if (i4 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z9 = zM6894i4 | z2;
                i5 = i3 & 896;
                if (i5 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zM6890g = z9 | z3 | ir1Var.m6890g(str) | ir1Var.m6886e(df2Var.ordinal());
                Object objM6869O4 = ir1Var.m6869O();
                if (!zM6890g || objM6869O4 == i50Var) {
                    C0869le c0869le = new C0869le((byte) 1);
                    c0869le.f23968b = cd3Var;
                    c0869le.f23969c = wp1Var2;
                    c0869le.f23970d = ed3Var;
                    c0869le.f23971e = str;
                    df2Var2 = df2Var;
                    c0869le.f23972f = df2Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0869le);
                    obj2 = c0869le;
                } else {
                    df2Var2 = df2Var;
                    obj2 = objM6869O4;
                }
                lb5.m7923d(cd3Var, (yp1) obj2, ir1Var);
                boolean zM6894i5 = ir1Var.m6894i(cd3Var);
                if (i4 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z10 = zM6894i5 | z4;
                if (i5 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zM6890g2 = z10 | z5 | ir1Var.m6890g(str) | ir1Var.m6886e(df2Var2.ordinal());
                Object objM6869O5 = ir1Var.m6869O();
                obj3 = objM6869O5;
                if (zM6890g2 || objM6869O5 == i50Var) {
                    C0907mf c0907mf = new C0907mf((byte) 0);
                    c0907mf.f24849b = cd3Var;
                    c0907mf.f24850c = wp1Var2;
                    c0907mf.f24851d = ed3Var;
                    c0907mf.f24852e = str;
                    c0907mf.f24853f = df2Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0907mf);
                    obj3 = c0907mf;
                }
                lb5.m7914W(ir1Var, (wp1) obj3);
                boolean zM6894i6 = ir1Var.m6894i(cd3Var);
                if ((i3 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zM6894i6 | z6;
                Object objM6869O6 = ir1Var.m6869O();
                obj4 = objM6869O6;
                if (z7 || objM6869O6 == i50Var) {
                    C0558d0 c0558d0 = new C0558d0((byte) 5);
                    c0558d0.f16655b = cd3Var;
                    c0558d0.f16656c = dd3Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0558d0);
                    obj4 = c0558d0;
                }
                lb5.m7923d(dd3Var, (yp1) obj4, ir1Var);
                zM6894i = ir1Var.m6894i(cd3Var);
                objM6869O3 = ir1Var.m6869O();
                if (zM6894i || objM6869O3 == i50Var) {
                    objM6869O3 = new C0594e0((Object) cd3Var, wm0Var, (byte) 3);
                    ir1Var.m6905n0(objM6869O3);
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O3, cd3Var);
                zM6894i2 = ir1Var.m6894i(cd3Var);
                Object objM6869O7 = ir1Var.m6869O();
                obj5 = objM6869O7;
                if (zM6894i2 || objM6869O7 == i50Var) {
                    C0833kf c0833kf2 = new C0833kf((byte) 1);
                    c0833kf2.f23095b = cd3Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0833kf2);
                    obj5 = c0833kf2;
                }
                nt2 nt2VarM9120z = oh6.m9120z(kt2.f23428a, (yp1) obj5);
                zM6894i3 = ir1Var.m6894i(cd3Var) | ir1Var.m6886e(df2Var2.ordinal());
                Object objM6869O8 = ir1Var.m6869O();
                obj6 = objM6869O8;
                if (zM6894i3 || objM6869O8 == i50Var) {
                    C0981of c0981of = new C0981of((byte) 0);
                    c0981of.f26662b = cd3Var;
                    c0981of.f26663c = df2Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0981of);
                    obj6 = c0981of;
                }
                xq2Var = (xq2) obj6;
                iHashCode = Long.hashCode(ir1Var.f21683T);
                ga3VarM6902m = ir1Var.m6902m();
                nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z);
                bi0.f15310ap.getClass();
                if (ir1Var.f21685a != null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(wf2.f33290T);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, ia5.f21216g, xq2Var);
                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                C0006a5.m50F(ir1Var);
                C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                ir1Var.m6912r(true);
            } else {
                ir1Var.m6874W();
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                C0944nf c0944nf = new C0944nf((byte) 0);
                c0944nf.f25739d = dd3Var;
                c0944nf.f25740e = wp1Var2;
                c0944nf.f25741f = ed3Var;
                c0944nf.f25742g = pg0Var;
                c0944nf.f25737b = i;
                c0944nf.f25738c = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = c0944nf;
            }
        }
        i3 |= 48;
        wp1Var2 = wp1Var;
        if ((i & 384) == 0) {
            if (ir1Var.m6890g(ed3Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ir1Var.m6871T(i3 & 1, z)) {
            if (i9 != 0) {
                wp1Var2 = null;
            }
            view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
            ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            wm0Var = null;
            str = (String) ir1Var.m6898k(f31816a);
            df2Var = (df2) ir1Var.m6898k(ij0.f21479n);
            gr1VarM4685N = dt0.m4685N(ir1Var);
            sw2VarM7369C = k43.m7369C(pg0Var, ir1Var);
            Object[] objArr2 = new Object[0];
            objM6869O = ir1Var.m6869O();
            i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new C0515c5((byte) 8);
                ir1Var.m6905n0(objM6869O);
            }
            uuid = (UUID) dt0.m4686O(objArr2, (wp1) objM6869O, ir1Var, 48);
            zBooleanValue = ((Boolean) ir1Var.m6898k(f31817b)).booleanValue();
            objM6869O2 = ir1Var.m6869O();
            b = 14;
            if (objM6869O2 == i50Var) {
                f70 f70Var2 = new f70(b);
                cd3 cd3Var3 = new cd3(view.getContext());
                cd3Var3.f15944j = wp1Var2;
                cd3Var3.f15945k = ed3Var;
                cd3Var3.f15946l = str;
                cd3Var3.f15947m = view;
                cd3Var3.f15948n = zBooleanValue;
                cd3Var3.f15949o = f70Var2;
                cd3Var3.f15950p = (WindowManager) view.getContext().getSystemService("window");
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.gravity = 8388659;
                ed3 ed3Var3 = cd3Var3.f15945k;
                boolean zM11537b2 = m11537b(view);
                z8 = ed3Var3.f18018b;
                i6 = ed3Var3.f18017a;
                if (!z8) {
                    if (z8) {
                        i6 &= -8193;
                    }
                } else if (z8) {
                    i6 &= -8193;
                }
                layoutParams2.flags = i6;
                layoutParams2.type = cd3Var3.f15945k.f18022f;
                layoutParams2.token = view.getApplicationWindowToken();
                layoutParams2.width = -2;
                layoutParams2.height = -2;
                layoutParams2.format = -3;
                layoutParams2.setTitle(view.getContext().getResources().getString(C0995R.string.default_popup_window_title));
                cd3Var3.f15951q = layoutParams2;
                cd3Var3.f15952r = dd3Var;
                cd3Var3.f15953s = df2.f17011a;
                cd3Var3.f15954t = k43.m7398w(null);
                cd3Var3.f15955u = k43.m7398w(null);
                g32 g32Var2 = new g32((byte) 14);
                g32Var2.f19558b = cd3Var3;
                VarHandle.storeStoreFence();
                cd3Var3.f15957w = s94.m10566b(g32Var2);
                cd3Var3.f15958x = new Rect();
                C0833kf c0833kf3 = new C0833kf((byte) 2);
                c0833kf3.f23095b = cd3Var3;
                VarHandle.storeStoreFence();
                cd3Var3.f15959y = new aa4(c0833kf3);
                cd3Var3.setId(R.id.content);
                cd3Var3.setTag(C0995R.id.view_tree_lifecycle_owner, zp0.m13694z(view));
                cd3Var3.setTag(C0995R.id.view_tree_view_model_store_owner, ev0.m5352b0(view));
                cd3Var3.setTag(C0995R.id.view_tree_saved_state_registry_owner, dt0.m4681D(view));
                cd3Var3.setTag(C0995R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
                cd3Var3.setClipChildren(false);
                cd3Var3.setElevation(ky0Var.mo3575E(8.0f));
                cd3Var3.setOutlineProvider(new bd3((byte) 0));
                cd3Var3.f15941A = k43.m7398w(AbstractC0647fd.f18912b);
                cd3Var3.f15943C = new int[2];
                VarHandle.storeStoreFence();
                C0870lf c0870lf2 = new C0870lf((byte) 0);
                c0870lf2.f23989b = cd3Var3;
                c0870lf2.f23990c = sw2VarM7369C;
                VarHandle.storeStoreFence();
                cd3Var3.m3979m(gr1VarM4685N, new pg0(-297523940, true, c0870lf2));
                ir1Var.m6905n0(cd3Var3);
                obj = cd3Var3;
            } else {
                obj = objM6869O2;
            }
            cd3Var = (cd3) obj;
            boolean zM6894i7 = ir1Var.m6894i(cd3Var);
            i4 = i3 & 112;
            if (i4 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z11 = zM6894i7 | z2;
            i5 = i3 & 896;
            if (i5 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            zM6890g = z11 | z3 | ir1Var.m6890g(str) | ir1Var.m6886e(df2Var.ordinal());
            Object objM6869O9 = ir1Var.m6869O();
            if (zM6890g) {
                C0869le c0869le2 = new C0869le((byte) 1);
                c0869le2.f23968b = cd3Var;
                c0869le2.f23969c = wp1Var2;
                c0869le2.f23970d = ed3Var;
                c0869le2.f23971e = str;
                df2Var2 = df2Var;
                c0869le2.f23972f = df2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0869le2);
                obj2 = c0869le2;
            } else {
                C0869le c0869le3 = new C0869le((byte) 1);
                c0869le3.f23968b = cd3Var;
                c0869le3.f23969c = wp1Var2;
                c0869le3.f23970d = ed3Var;
                c0869le3.f23971e = str;
                df2Var2 = df2Var;
                c0869le3.f23972f = df2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0869le3);
                obj2 = c0869le3;
            }
            lb5.m7923d(cd3Var, (yp1) obj2, ir1Var);
            boolean zM6894i8 = ir1Var.m6894i(cd3Var);
            if (i4 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z12 = zM6894i8 | z4;
            if (i5 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            zM6890g2 = z12 | z5 | ir1Var.m6890g(str) | ir1Var.m6886e(df2Var2.ordinal());
            Object objM6869O10 = ir1Var.m6869O();
            obj3 = objM6869O10;
            if (zM6890g2) {
                C0907mf c0907mf2 = new C0907mf((byte) 0);
                c0907mf2.f24849b = cd3Var;
                c0907mf2.f24850c = wp1Var2;
                c0907mf2.f24851d = ed3Var;
                c0907mf2.f24852e = str;
                c0907mf2.f24853f = df2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0907mf2);
                obj3 = c0907mf2;
            } else {
                C0907mf c0907mf3 = new C0907mf((byte) 0);
                c0907mf3.f24849b = cd3Var;
                c0907mf3.f24850c = wp1Var2;
                c0907mf3.f24851d = ed3Var;
                c0907mf3.f24852e = str;
                c0907mf3.f24853f = df2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0907mf3);
                obj3 = c0907mf3;
            }
            lb5.m7914W(ir1Var, (wp1) obj3);
            boolean zM6894i9 = ir1Var.m6894i(cd3Var);
            if ((i3 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zM6894i9 | z6;
            Object objM6869O11 = ir1Var.m6869O();
            obj4 = objM6869O11;
            if (z7) {
                C0558d0 c0558d1 = new C0558d0((byte) 5);
                c0558d1.f16655b = cd3Var;
                c0558d1.f16656c = dd3Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d1);
                obj4 = c0558d1;
            } else {
                C0558d0 c0558d2 = new C0558d0((byte) 5);
                c0558d2.f16655b = cd3Var;
                c0558d2.f16656c = dd3Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d2);
                obj4 = c0558d2;
            }
            lb5.m7923d(dd3Var, (yp1) obj4, ir1Var);
            zM6894i = ir1Var.m6894i(cd3Var);
            objM6869O3 = ir1Var.m6869O();
            if (zM6894i) {
                objM6869O3 = new C0594e0((Object) cd3Var, wm0Var, (byte) 3);
                ir1Var.m6905n0(objM6869O3);
            } else {
                objM6869O3 = new C0594e0((Object) cd3Var, wm0Var, (byte) 3);
                ir1Var.m6905n0(objM6869O3);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O3, cd3Var);
            zM6894i2 = ir1Var.m6894i(cd3Var);
            Object objM6869O12 = ir1Var.m6869O();
            obj5 = objM6869O12;
            if (zM6894i2) {
                C0833kf c0833kf4 = new C0833kf((byte) 1);
                c0833kf4.f23095b = cd3Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0833kf4);
                obj5 = c0833kf4;
            } else {
                C0833kf c0833kf5 = new C0833kf((byte) 1);
                c0833kf5.f23095b = cd3Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0833kf5);
                obj5 = c0833kf5;
            }
            nt2 nt2VarM9120z2 = oh6.m9120z(kt2.f23428a, (yp1) obj5);
            zM6894i3 = ir1Var.m6894i(cd3Var) | ir1Var.m6886e(df2Var2.ordinal());
            Object objM6869O13 = ir1Var.m6869O();
            obj6 = objM6869O13;
            if (zM6894i3) {
                C0981of c0981of2 = new C0981of((byte) 0);
                c0981of2.f26662b = cd3Var;
                c0981of2.f26663c = df2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0981of2);
                obj6 = c0981of2;
            } else {
                C0981of c0981of3 = new C0981of((byte) 0);
                c0981of3.f26662b = cd3Var;
                c0981of3.f26663c = df2Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0981of3);
                obj6 = c0981of3;
            }
            xq2Var = (xq2) obj6;
            iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3VarM6902m = ir1Var.m6902m();
            nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z2);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a != null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2Var);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0944nf c0944nf2 = new C0944nf((byte) 0);
            c0944nf2.f25739d = dd3Var;
            c0944nf2.f25740e = wp1Var2;
            c0944nf2.f25741f = ed3Var;
            c0944nf2.f25742g = pg0Var;
            c0944nf2.f25737b = i;
            c0944nf2.f25738c = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0944nf2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11537b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
