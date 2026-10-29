package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class nz0 extends pn1 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: X */
    public final kz0 f26207X;

    /* JADX INFO: renamed from: Y */
    public final lz0 f26208Y;

    /* JADX INFO: renamed from: Z */
    public int f26209Z;

    /* JADX INFO: renamed from: a0 */
    public int f26210a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f26211b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f26212c0;

    /* JADX INFO: renamed from: d0 */
    public int f26213d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f26214e0;

    /* JADX INFO: renamed from: f0 */
    public final ar3 f26215f0;

    /* JADX INFO: renamed from: g0 */
    public Dialog f26216g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f26217h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f26218i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f26219j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f26220k0;

    public nz0() {
        this.f27778a = -1;
        this.f27782e = UUID.randomUUID().toString();
        this.f27785h = null;
        this.f27787j = null;
        this.f27799v = new eo1();
        this.f27759D = true;
        this.f27763H = true;
        this.f27768M = fk2.f19058e;
        this.f27770O = new zt1();
        qv2 qv2Var = new qv2();
        qv2Var.f28822a = new Object();
        qv2Var.f28823b = new zt3();
        qv2Var.f28824c = 0;
        Object obj = qv2.f28821k;
        qv2Var.f28827f = obj;
        qv2Var.f28831j = new RunnableC1029pc(qv2Var);
        qv2Var.f28826e = obj;
        qv2Var.f28828g = -1;
        this.f27772Q = qv2Var;
        i50 i50Var = new i50((byte) 9);
        VarHandle.storeStoreFence();
        this.f27774S = i50Var;
        new AtomicInteger();
        this.f27775T = new ArrayList();
        nn1 nn1Var = new nn1((byte) 0);
        nn1Var.f25960b = this;
        VarHandle.storeStoreFence();
        this.f27776U = nn1Var;
        nn1 nn1Var2 = new nn1((byte) 1);
        nn1Var2.f25960b = this;
        VarHandle.storeStoreFence();
        this.f27777V = nn1Var2;
        m9580h();
        kz0 kz0Var = new kz0();
        kz0Var.f23630a = this;
        VarHandle.storeStoreFence();
        this.f26207X = kz0Var;
        lz0 lz0Var = new lz0();
        lz0Var.f24481a = this;
        VarHandle.storeStoreFence();
        this.f26208Y = lz0Var;
        this.f26209Z = 0;
        this.f26210a0 = 0;
        this.f26211b0 = true;
        this.f26212c0 = true;
        this.f26213d0 = -1;
        ar3 ar3Var = new ar3((byte) 23);
        ar3Var.f14813b = this;
        VarHandle.storeStoreFence();
        this.f26215f0 = ar3Var;
        this.f26220k0 = false;
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: a */
    public final se0 mo8901a() {
        super.mo8901a();
        mz0 mz0Var = new mz0((byte) 0);
        mz0Var.f25340v = this;
        VarHandle.storeStoreFence();
        return mz0Var;
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: m */
    public final void mo8902m(Context context) {
        im2 im2Var;
        super.mo8902m(context);
        qv2 qv2Var = this.f27772Q;
        qv2Var.getClass();
        qv2.m10128a("observeForever");
        im2 im2Var2 = new im2();
        im2Var2.f21556d = qv2Var;
        im2Var2.f21555c = -1;
        ar3 ar3Var = this.f26215f0;
        im2Var2.f21553a = ar3Var;
        VarHandle.storeStoreFence();
        zt3 zt3Var = qv2Var.f28823b;
        wt3 wt3Var = zt3Var.f36360a;
        while (wt3Var != null && !wt3Var.f33719a.equals(ar3Var)) {
            wt3Var = wt3Var.f33721c;
        }
        if (wt3Var != null) {
            im2Var = wt3Var.f33720b;
        } else {
            wt3 wt3Var2 = new wt3();
            wt3Var2.f33719a = ar3Var;
            wt3Var2.f33720b = im2Var2;
            VarHandle.storeStoreFence();
            zt3Var.f36363d++;
            wt3 wt3Var3 = zt3Var.f36361b;
            if (wt3Var3 == null) {
                zt3Var.f36360a = wt3Var2;
                zt3Var.f36361b = wt3Var2;
            } else {
                wt3Var3.f33721c = wt3Var2;
                wt3Var2.f33722d = wt3Var3;
                zt3Var.f36361b = wt3Var2;
            }
            im2Var = null;
        }
        if (im2Var == null) {
            im2Var2.m6817a(true);
        }
        if (this.f26219j0) {
            return;
        }
        this.f26218i0 = false;
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: n */
    public final void mo8903n(Bundle bundle) {
        Bundle bundle2;
        this.f27760E = true;
        Bundle bundle3 = this.f27779b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f27799v.m5232U(bundle2);
            eo1 eo1Var = this.f27799v;
            eo1Var.f18295H = false;
            eo1Var.f18296I = false;
            eo1Var.f18302O.f20752g = false;
            eo1Var.m5263v(1);
        }
        eo1 eo1Var2 = this.f27799v;
        if (eo1Var2.f18325v < 1) {
            eo1Var2.f18295H = false;
            eo1Var2.f18296I = false;
            eo1Var2.f18302O.f20752g = false;
            eo1Var2.m5263v(1);
        }
        new Handler();
        this.f26212c0 = this.f27802y == 0;
        if (bundle != null) {
            this.f26209Z = bundle.getInt("android:style", 0);
            this.f26210a0 = bundle.getInt("android:theme", 0);
            this.f26211b0 = bundle.getBoolean("android:cancelable", true);
            this.f26212c0 = bundle.getBoolean("android:showsDialog", this.f26212c0);
            this.f26213d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: o */
    public final void mo8904o() {
        this.f27760E = true;
        Dialog dialog = this.f26216g0;
        if (dialog != null) {
            this.f26217h0 = true;
            dialog.setOnDismissListener(null);
            this.f26216g0.dismiss();
            if (!this.f26218i0) {
                onDismiss(this.f26216g0);
            }
            this.f26216g0 = null;
            this.f26220k0 = false;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f26217h0) {
            return;
        }
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f26218i0) {
            return;
        }
        this.f26218i0 = true;
        this.f26219j0 = false;
        Dialog dialog = this.f26216g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f26216g0.dismiss();
        }
        this.f26217h0 = true;
        if (this.f26213d0 >= 0) {
            eo1 eo1VarM9579g = m9579g();
            int i = this.f26213d0;
            if (i < 0) {
                C1077qn.m9987m(c75.m3877i(i, "Bad id: "));
                return;
            }
            co1 co1Var = new co1();
            co1Var.f16178b = eo1VarM9579g;
            co1Var.f16177a = i;
            VarHandle.storeStoreFence();
            eo1VarM9579g.m5266y(co1Var, true);
            this.f26213d0 = -1;
            return;
        }
        C0589dw c0589dw = new C0589dw(m9579g());
        c0589dw.f17448o = true;
        eo1 eo1Var = this.f27797t;
        if (eo1Var == null || eo1Var == c0589dw.f17450q) {
            c0589dw.m4766b(new po1(3, this));
            c0589dw.m4769e(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: p */
    public final void mo8905p() {
        this.f27760E = true;
        if (!this.f26219j0 && !this.f26218i0) {
            this.f26218i0 = true;
        }
        qv2 qv2Var = this.f27772Q;
        qv2Var.getClass();
        qv2.m10128a("removeObserver");
        zt3 zt3Var = qv2Var.f28823b;
        WeakHashMap weakHashMap = zt3Var.f36362c;
        wt3 wt3Var = zt3Var.f36360a;
        while (wt3Var != null && !wt3Var.f33719a.equals(this.f26215f0)) {
            wt3Var = wt3Var.f33721c;
        }
        im2 im2Var = null;
        if (wt3Var != null) {
            zt3Var.f36363d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((yt3) it.next()).mo11987a(wt3Var);
                }
            }
            wt3 wt3Var2 = wt3Var.f33722d;
            wt3 wt3Var3 = wt3Var.f33721c;
            if (wt3Var2 != null) {
                wt3Var2.f33721c = wt3Var3;
            } else {
                zt3Var.f36360a = wt3Var3;
            }
            wt3 wt3Var4 = wt3Var.f33721c;
            if (wt3Var4 != null) {
                wt3Var4.f33722d = wt3Var2;
            } else {
                zt3Var.f36361b = wt3Var2;
            }
            wt3Var.f33721c = null;
            wt3Var.f33722d = null;
            im2Var = wt3Var.f33720b;
        }
        if (im2Var == null) {
            return;
        }
        im2Var.m6817a(false);
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: q */
    public final LayoutInflater mo8906q(Bundle bundle) {
        LayoutInflater layoutInflaterMo8906q = super.mo8906q(bundle);
        boolean z = this.f26212c0;
        if (z && !this.f26214e0) {
            if (z && !this.f26220k0) {
                try {
                    this.f26214e0 = true;
                    Dialog dialogMo8911x = mo8911x();
                    this.f26216g0 = dialogMo8911x;
                    EsActivity esActivity = null;
                    if (this.f26212c0) {
                        int i = this.f26209Z;
                        if (i == 1 || i == 2) {
                            dialogMo8911x.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogMo8911x.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo8911x.requestWindowFeature(1);
                        }
                        rn1 rn1Var = this.f27798u;
                        if (rn1Var != null) {
                            esActivity = rn1Var.f29431v;
                        }
                        if (esActivity != null) {
                            this.f26216g0.setOwnerActivity(esActivity);
                        }
                        this.f26216g0.setCancelable(this.f26211b0);
                        this.f26216g0.setOnCancelListener(this.f26207X);
                        this.f26216g0.setOnDismissListener(this.f26208Y);
                        this.f26220k0 = true;
                    } else {
                        this.f26216g0 = null;
                    }
                    this.f26214e0 = false;
                } catch (Throwable th) {
                    this.f26214e0 = false;
                    throw th;
                }
            }
            if (eo1.m5212J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f26216g0;
            if (dialog != null) {
                return layoutInflaterMo8906q.cloneInContext(dialog.getContext());
            }
        } else if (eo1.m5212J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f26212c0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterMo8906q;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterMo8906q;
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: r */
    public final void mo8907r(Bundle bundle) {
        Dialog dialog = this.f26216g0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f26209Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f26210a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f26211b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f26212c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f26213d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: s */
    public final void mo8908s() {
        this.f27760E = true;
        Dialog dialog = this.f26216g0;
        if (dialog != null) {
            this.f26217h0 = false;
            dialog.show();
            View decorView = this.f26216g0.getWindow().getDecorView();
            decorView.setTag(C0995R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(C0995R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(C0995R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: t */
    public final void mo8909t() {
        this.f27760E = true;
        Dialog dialog = this.f26216g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000.pn1
    /* JADX INFO: renamed from: u */
    public final void mo8910u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo8910u(layoutInflater, viewGroup, bundle);
        if (this.f26216g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f26216g0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: x */
    public Dialog mo8911x() {
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        eg0 eg0Var = new eg0(m9585v(), this.f26210a0);
        g32 g32Var = new g32((byte) 20);
        g32Var.f19558b = eg0Var;
        VarHandle.storeStoreFence();
        zu3 zu3Var = new zu3();
        zu3Var.f36384a = eg0Var;
        zu3Var.f36385b = g32Var;
        zu3Var.f36386c = new r50((byte) 19);
        zu3Var.f36387d = new LinkedHashMap();
        byte b = 1;
        zu3Var.f36391h = true;
        VarHandle.storeStoreFence();
        pq3 pq3Var = new pq3(b);
        pq3Var.f27896b = zu3Var;
        yu3 yu3Var = new yu3();
        yu3Var.f35540a = zu3Var;
        VarHandle.storeStoreFence();
        pq3Var.f27897c = yu3Var;
        VarHandle.storeStoreFence();
        eg0Var.f18064b = pq3Var;
        dg0 dg0Var = new dg0((byte) 0);
        dg0Var.f17028b = eg0Var;
        VarHandle.storeStoreFence();
        eg0Var.f18065c = new dg4(dg0Var);
        dg0 dg0Var2 = new dg0(b);
        dg0Var2.f17028b = eg0Var;
        VarHandle.storeStoreFence();
        eg0Var.f18066d = new dg4(dg0Var2);
        VarHandle.storeStoreFence();
        return eg0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
