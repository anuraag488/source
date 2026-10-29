package p000;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pn1 implements ComponentCallbacks, View.OnCreateContextMenuListener, lk2, py4, ov1, av3 {

    /* JADX INFO: renamed from: W */
    public static final Object f27755W = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f27756A;

    /* JADX INFO: renamed from: B */
    public boolean f27757B;

    /* JADX INFO: renamed from: C */
    public boolean f27758C;

    /* JADX INFO: renamed from: D */
    public boolean f27759D;

    /* JADX INFO: renamed from: E */
    public boolean f27760E;

    /* JADX INFO: renamed from: F */
    public ViewGroup f27761F;

    /* JADX INFO: renamed from: G */
    public boolean f27762G;

    /* JADX INFO: renamed from: H */
    public boolean f27763H;

    /* JADX INFO: renamed from: I */
    public on1 f27764I;

    /* JADX INFO: renamed from: J */
    public boolean f27765J;

    /* JADX INFO: renamed from: K */
    public boolean f27766K;

    /* JADX INFO: renamed from: L */
    public String f27767L;

    /* JADX INFO: renamed from: M */
    public fk2 f27768M;

    /* JADX INFO: renamed from: N */
    public ok2 f27769N;

    /* JADX INFO: renamed from: O */
    public zt1 f27770O;

    /* JADX INFO: renamed from: P */
    public qo1 f27771P;

    /* JADX INFO: renamed from: Q */
    public qv2 f27772Q;

    /* JADX INFO: renamed from: R */
    public pq3 f27773R;

    /* JADX INFO: renamed from: S */
    public i50 f27774S;

    /* JADX INFO: renamed from: T */
    public ArrayList f27775T;

    /* JADX INFO: renamed from: U */
    public nn1 f27776U;

    /* JADX INFO: renamed from: V */
    public nn1 f27777V;

    /* JADX INFO: renamed from: a */
    public int f27778a;

    /* JADX INFO: renamed from: b */
    public Bundle f27779b;

    /* JADX INFO: renamed from: c */
    public SparseArray f27780c;

    /* JADX INFO: renamed from: d */
    public Bundle f27781d;

    /* JADX INFO: renamed from: e */
    public String f27782e;

    /* JADX INFO: renamed from: f */
    public Bundle f27783f;

    /* JADX INFO: renamed from: g */
    public pn1 f27784g;

    /* JADX INFO: renamed from: h */
    public String f27785h;

    /* JADX INFO: renamed from: i */
    public int f27786i;

    /* JADX INFO: renamed from: j */
    public Boolean f27787j;

    /* JADX INFO: renamed from: k */
    public boolean f27788k;

    /* JADX INFO: renamed from: l */
    public boolean f27789l;

    /* JADX INFO: renamed from: m */
    public boolean f27790m;

    /* JADX INFO: renamed from: n */
    public boolean f27791n;

    /* JADX INFO: renamed from: o */
    public boolean f27792o;

    /* JADX INFO: renamed from: p */
    public boolean f27793p;

    /* JADX INFO: renamed from: q */
    public boolean f27794q;

    /* JADX INFO: renamed from: r */
    public boolean f27795r;

    /* JADX INFO: renamed from: s */
    public int f27796s;

    /* JADX INFO: renamed from: t */
    public eo1 f27797t;

    /* JADX INFO: renamed from: u */
    public rn1 f27798u;

    /* JADX INFO: renamed from: v */
    public eo1 f27799v;

    /* JADX INFO: renamed from: w */
    public pn1 f27800w;

    /* JADX INFO: renamed from: x */
    public int f27801x;

    /* JADX INFO: renamed from: y */
    public int f27802y;

    /* JADX INFO: renamed from: z */
    public String f27803z;

    /* JADX INFO: renamed from: a */
    public se0 mo8901a() {
        mz0 mz0Var = new mz0((byte) 1);
        mz0Var.f25340v = this;
        VarHandle.storeStoreFence();
        return mz0Var;
    }

    @Override // p000.ov1
    /* JADX INFO: renamed from: b */
    public final gv2 mo2975b() {
        Application application;
        Context applicationContext = m9585v().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && eo1.m5212J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m9585v().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        gv2 gv2Var = new gv2(0);
        if (application != null) {
            gv2Var.m6174a(ly4.f24472d, application);
        }
        gv2Var.m6174a(tu3.f31456a, this);
        gv2Var.m6174a(tu3.f31457b, this);
        Bundle bundle = this.f27783f;
        if (bundle != null) {
            gv2Var.m6174a(tu3.f31458c, bundle);
        }
        return gv2Var;
    }

    @Override // p000.py4
    /* JADX INFO: renamed from: c */
    public final oy4 mo2976c() {
        if (this.f27797t == null) {
            C1077qn.m9989o("Can't access ViewModels from detached fragment");
            return null;
        }
        int iM9578f = m9578f();
        fk2 fk2Var = fk2.f19054a;
        if (iM9578f == 1) {
            C1077qn.m9989o("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f27797t.f18302O.f20749d;
        oy4 oy4Var = (oy4) map.get(this.f27782e);
        if (oy4Var != null) {
            return oy4Var;
        }
        oy4 oy4Var2 = new oy4();
        map.put(this.f27782e, oy4Var2);
        return oy4Var2;
    }

    /* JADX INFO: renamed from: d */
    public final on1 m9576d() {
        on1 on1Var = this.f27764I;
        if (on1Var != null) {
            return on1Var;
        }
        on1 on1Var2 = new on1();
        Object obj = f27755W;
        on1Var2.f26905f = obj;
        on1Var2.f26906g = obj;
        on1Var2.f26907h = obj;
        on1Var2.f26908i = null;
        this.f27764I = on1Var2;
        return on1Var2;
    }

    /* JADX INFO: renamed from: e */
    public final eo1 m9577e() {
        if (this.f27798u != null) {
            return this.f27799v;
        }
        wb1.m12192k("Fragment ", this, " has not been attached yet.");
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final int m9578f() {
        fk2 fk2Var = this.f27768M;
        return (fk2Var == fk2.f19055b || this.f27800w == null) ? fk2Var.ordinal() : Math.min(fk2Var.ordinal(), this.f27800w.m9578f());
    }

    /* JADX INFO: renamed from: g */
    public final eo1 m9579g() {
        eo1 eo1Var = this.f27797t;
        if (eo1Var != null) {
            return eo1Var;
        }
        wb1.m12192k("Fragment ", this, " not associated with a fragment manager.");
        return null;
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        return this.f27769N;
    }

    @Override // p000.av3
    public final yu3 getSavedStateRegistry() {
        return (yu3) this.f27773R.f27897c;
    }

    /* JADX INFO: renamed from: h */
    public final void m9580h() {
        this.f27769N = new ok2(this, true);
        g32 g32Var = new g32((byte) 20);
        g32Var.f19558b = this;
        VarHandle.storeStoreFence();
        zu3 zu3Var = new zu3();
        zu3Var.f36384a = this;
        zu3Var.f36385b = g32Var;
        zu3Var.f36386c = new r50((byte) 19);
        zu3Var.f36387d = new LinkedHashMap();
        zu3Var.f36391h = true;
        VarHandle.storeStoreFence();
        pq3 pq3Var = new pq3((byte) 1);
        pq3Var.f27896b = zu3Var;
        yu3 yu3Var = new yu3();
        yu3Var.f35540a = zu3Var;
        VarHandle.storeStoreFence();
        pq3Var.f27897c = yu3Var;
        VarHandle.storeStoreFence();
        this.f27773R = pq3Var;
        ArrayList arrayList = this.f27775T;
        nn1 nn1Var = this.f27776U;
        if (!arrayList.contains(nn1Var)) {
            if (this.f27778a >= 0) {
                nn1Var.m8801a();
            } else {
                arrayList.add(nn1Var);
            }
        }
        nn1 nn1Var2 = this.f27777V;
        if (arrayList.contains(nn1Var2)) {
            return;
        }
        if (this.f27778a >= 0) {
            nn1Var2.m8801a();
        } else {
            arrayList.add(nn1Var2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9581i() {
        m9580h();
        this.f27767L = this.f27782e;
        this.f27782e = UUID.randomUUID().toString();
        this.f27788k = false;
        this.f27789l = false;
        this.f27791n = false;
        this.f27792o = false;
        this.f27794q = false;
        this.f27796s = 0;
        this.f27797t = null;
        this.f27799v = new eo1();
        this.f27798u = null;
        this.f27801x = 0;
        this.f27802y = 0;
        this.f27803z = null;
        this.f27756A = false;
        this.f27757B = false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9582j() {
        if (this.f27756A) {
            return true;
        }
        eo1 eo1Var = this.f27797t;
        if (eo1Var != null) {
            pn1 pn1Var = this.f27800w;
            eo1Var.getClass();
            if (pn1Var == null ? false : pn1Var.m9582j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9583k() {
        return this.f27796s > 0;
    }

    /* JADX INFO: renamed from: l */
    public void m9584l(int i, int i2, Intent intent) {
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo8902m(Context context) {
        this.f27760E = true;
        rn1 rn1Var = this.f27798u;
        if ((rn1Var == null ? null : rn1Var.f29430u) != null) {
            this.f27760E = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo8903n(Bundle bundle);

    /* JADX INFO: renamed from: o */
    public abstract void mo8904o();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f27760E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        rn1 rn1Var = this.f27798u;
        EsActivity esActivity = rn1Var == null ? null : rn1Var.f29430u;
        if (esActivity != null) {
            esActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            wb1.m12192k("Fragment ", this, " not attached to an activity.");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f27760E = true;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo8905p();

    /* JADX INFO: renamed from: q */
    public LayoutInflater mo8906q(Bundle bundle) {
        rn1 rn1Var = this.f27798u;
        if (rn1Var == null) {
            C1077qn.m9989o("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        EsActivity esActivity = rn1Var.f29434y;
        LayoutInflater layoutInflaterCloneInContext = esActivity.getLayoutInflater().cloneInContext(esActivity);
        layoutInflaterCloneInContext.setFactory2(this.f27799v.f18309f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo8907r(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public abstract void mo8908s();

    /* JADX INFO: renamed from: t */
    public abstract void mo8909t();

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f27782e);
        if (this.f27801x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f27801x));
        }
        if (this.f27803z != null) {
            sb.append(" tag=");
            sb.append(this.f27803z);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo8910u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f27799v.m5227P();
        this.f27795r = true;
        oy4 oy4VarMo2976c = mo2976c();
        ln1 ln1Var = new ln1((byte) 7);
        ln1Var.f24197b = this;
        VarHandle.storeStoreFence();
        qo1 qo1Var = new qo1();
        qo1Var.f28637d = null;
        qo1Var.f28638e = null;
        qo1Var.f28634a = this;
        qo1Var.f28635b = oy4VarMo2976c;
        qo1Var.f28636c = ln1Var;
        VarHandle.storeStoreFence();
        this.f27771P = qo1Var;
        RunnableC0484ba runnableC0484ba = new RunnableC0484ba((byte) 2);
        VarHandle.storeStoreFence();
        this.f27774S.m6673k(runnableC0484ba, "Fragment#onCreateView");
        if (this.f27771P.f28637d == null) {
            this.f27771P = null;
        } else {
            C1077qn.m9989o("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* JADX INFO: renamed from: v */
    public final Context m9585v() {
        rn1 rn1Var = this.f27798u;
        EsActivity esActivity = rn1Var == null ? null : rn1Var.f29431v;
        if (esActivity != null) {
            return esActivity;
        }
        wb1.m12192k("Fragment ", this, " not attached to a context.");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final void m9586w(int i, int i2, int i3, int i4) {
        if (this.f27764I == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m9576d().f26901b = i;
        m9576d().f26902c = i2;
        m9576d().f26903d = i3;
        m9576d().f26904e = i4;
    }
}
