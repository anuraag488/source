package p000;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 {

    /* JADX INFO: renamed from: a */
    public nh3 f24222a;

    /* JADX INFO: renamed from: b */
    public C1283w7 f24223b;

    /* JADX INFO: renamed from: c */
    public pn1 f24224c;

    /* JADX INFO: renamed from: d */
    public boolean f24225d = false;

    /* JADX INFO: renamed from: e */
    public int f24226e = -1;

    public lo1(nh3 nh3Var, C1283w7 c1283w7, pn1 pn1Var) {
        this.f24222a = nh3Var;
        this.f24223b = c1283w7;
        this.f24224c = pn1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8044a() throws Exception {
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + pn1Var);
        }
        Bundle bundle = pn1Var.f27779b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        pn1Var.f27799v.m5227P();
        pn1Var.f27778a = 3;
        pn1Var.f27760E = false;
        i50 i50Var = pn1Var.f27774S;
        ln1 ln1Var = new ln1((byte) 10);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "Fragment#onActivityCreated");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onActivityCreated()");
            return;
        }
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + pn1Var);
        }
        pn1Var.f27779b = null;
        eo1 eo1Var = pn1Var.f27799v;
        eo1Var.f18295H = false;
        eo1Var.f18296I = false;
        eo1Var.f18302O.f20752g = false;
        eo1Var.m5263v(4);
        this.f24222a.m8751p(pn1Var, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m8045b() throws Exception {
        nh3 nh3Var = this.f24222a;
        C1283w7 c1283w7 = this.f24223b;
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + pn1Var);
        }
        pn1 pn1Var2 = pn1Var.f27784g;
        lo1 lo1Var = null;
        if (pn1Var2 != null) {
            lo1 lo1Var2 = (lo1) ((HashMap) c1283w7.f33128d).get(pn1Var2.f27782e);
            if (lo1Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(pn1Var);
                pn1 pn1Var3 = pn1Var.f27784g;
                sb.append(" declared target fragment ");
                sb.append(pn1Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            pn1Var.f27785h = pn1Var.f27784g.f27782e;
            pn1Var.f27784g = null;
            lo1Var = lo1Var2;
        } else {
            String str = pn1Var.f27785h;
            if (str != null && (lo1Var = (lo1) ((HashMap) c1283w7.f33128d).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(pn1Var);
                sb2.append(" declared target fragment ");
                C1077qn.m9989o(zi4.m13623w(sb2, pn1Var.f27785h, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (lo1Var != null) {
            lo1Var.m8053j();
        }
        eo1 eo1Var = pn1Var.f27797t;
        pn1Var.f27798u = eo1Var.f18326w;
        pn1Var.f27800w = eo1Var.f18328y;
        nh3Var.m8757v(pn1Var, false);
        ArrayList arrayList = pn1Var.f27775T;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nn1) obj).m8801a();
        }
        arrayList.clear();
        pn1Var.f27799v.m5240b(pn1Var.f27798u, pn1Var.mo8901a(), pn1Var);
        pn1Var.f27778a = 0;
        pn1Var.f27760E = false;
        i50 i50Var = pn1Var.f27774S;
        ln1 ln1Var = new ln1((byte) 13);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "Fragment#onAttach");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = pn1Var.f27797t.f18319p.iterator();
        while (it.hasNext()) {
            ((io1) it.next()).mo6847a();
        }
        eo1 eo1Var2 = pn1Var.f27799v;
        eo1Var2.f18295H = false;
        eo1Var2.f18296I = false;
        eo1Var2.f18302O.f20752g = false;
        eo1Var2.m5263v(0);
        nh3Var.m8752q(pn1Var, false);
    }

    /* JADX INFO: renamed from: c */
    public final int m8046c() {
        xw0 xw0Var;
        Object obj;
        Object obj2;
        pn1 pn1Var = this.f24224c;
        if (pn1Var.f27797t == null) {
            return pn1Var.f27778a;
        }
        int iMin = this.f24226e;
        int iOrdinal = pn1Var.f27768M.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (pn1Var.f27791n) {
            boolean z = pn1Var.f27792o;
            int i2 = this.f24226e;
            if (z) {
                iMin = Math.max(i2, 2);
            } else {
                iMin = i2 < 4 ? Math.min(iMin, pn1Var.f27778a) : Math.min(iMin, 1);
            }
        }
        if (pn1Var.f27793p && pn1Var.f27761F == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!pn1Var.f27788k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = pn1Var.f27761F;
        if (viewGroup != null) {
            pn1Var.m9579g().m5223H();
            Object tag = viewGroup.getTag(C0995R.id.special_effects_controller_view_tag);
            if (tag instanceof xw0) {
                xw0Var = (xw0) tag;
            } else {
                xw0Var = new xw0();
                xw0Var.f34653a = viewGroup;
                xw0Var.f34654b = new ArrayList();
                xw0Var.f34655c = new ArrayList();
                viewGroup.setTag(C0995R.id.special_effects_controller_view_tag, xw0Var);
            }
            ArrayList arrayList = xw0Var.f34654b;
            int size = arrayList.size();
            int i3 = 0;
            do {
                obj = null;
                if (i3 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i3);
                i3++;
                ((va4) obj2).getClass();
            } while (!z62.m13387o(null, pn1Var));
            ArrayList arrayList2 = xw0Var.f34655c;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj3 = arrayList2.get(i);
                i++;
                ((va4) obj3).getClass();
                if (z62.m13387o(null, pn1Var)) {
                    obj = obj3;
                    break;
                }
            }
        }
        ta4 ta4Var = ta4.f31042a;
        ta4 ta4Var2 = ta4.f31043b;
        if (pn1Var.f27789l) {
            iMin = pn1Var.m9583k() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (pn1Var.f27762G && pn1Var.f27778a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (pn1Var.f27790m) {
            iMin = Math.max(iMin, 3);
        }
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + pn1Var);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public final void m8047d() throws Exception {
        Bundle bundle;
        nh3 nh3Var = this.f24222a;
        pn1 pn1Var = this.f24224c;
        byte b = 3;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + pn1Var);
        }
        Bundle bundle2 = pn1Var.f27779b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (pn1Var.f27766K) {
            pn1Var.f27778a = 1;
            Bundle bundle4 = pn1Var.f27779b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            pn1Var.f27799v.m5232U(bundle);
            eo1 eo1Var = pn1Var.f27799v;
            eo1Var.f18295H = false;
            eo1Var.f18296I = false;
            eo1Var.f18302O.f20752g = false;
            eo1Var.m5263v(1);
            return;
        }
        nh3Var.m8758w(pn1Var, false);
        pn1Var.f27799v.m5227P();
        pn1Var.f27778a = 1;
        pn1Var.f27760E = false;
        ok2 ok2Var = pn1Var.f27769N;
        il3 il3Var = new il3(b);
        il3Var.f21532b = pn1Var;
        VarHandle.storeStoreFence();
        ok2Var.mo6015a(il3Var);
        i50 i50Var = pn1Var.f27774S;
        mn1 mn1Var = new mn1((byte) 0);
        mn1Var.f25061b = pn1Var;
        mn1Var.f25062c = bundle3;
        VarHandle.storeStoreFence();
        i50Var.m6673k(mn1Var, "Fragment#onCreate");
        pn1Var.f27766K = true;
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onCreate()");
            return;
        }
        ln1 ln1Var = new ln1((byte) 6);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "FragmentLifecycle#handleLifecycleEvent(ON_CREATE)");
        nh3Var.m8753r(pn1Var, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m8048e() {
        String resourceName;
        pn1 pn1Var = this.f24224c;
        if (pn1Var.f27791n) {
            return;
        }
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + pn1Var);
        }
        Bundle bundle = pn1Var.f27779b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo8906q = pn1Var.mo8906q(bundle2);
        ViewGroup viewGroup2 = pn1Var.f27761F;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = pn1Var.f27802y;
            if (i != 0) {
                if (i == -1) {
                    xy4.m12789r("Cannot create fragment ", pn1Var, " for a container view with no id");
                    return;
                }
                viewGroup = (ViewGroup) pn1Var.f27797t.f18327x.mo8456P(i);
                if (viewGroup == null) {
                    if (!pn1Var.f27794q && !pn1Var.f27793p) {
                        try {
                            resourceName = pn1Var.m9585v().getResources().getResourceName(pn1Var.f27802y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(pn1Var.f27802y) + " (" + resourceName + ") for fragment " + pn1Var);
                    }
                } else if (!(viewGroup instanceof tn1)) {
                    no1 no1Var = oo1.f26923a;
                    oo1.m9219b(new jo1(pn1Var, "Attempting to add fragment " + pn1Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    oo1.m9218a(pn1Var).getClass();
                    mo1[] mo1VarArr = mo1.f25080a;
                }
            }
        }
        pn1Var.f27761F = viewGroup;
        pn1Var.mo8910u(layoutInflaterMo8906q, viewGroup, bundle2);
        pn1Var.f27778a = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m8049f() throws Exception {
        boolean z;
        pn1 pn1VarM12150z;
        C1283w7 c1283w7 = this.f24223b;
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + pn1Var);
        }
        byte b = 1;
        int i = 0;
        byte b2 = 0;
        byte b3 = pn1Var.f27789l && !pn1Var.m9583k();
        if (b3 != false) {
            c1283w7.m12129P(pn1Var.f27782e, null);
        }
        if (b3 == false) {
            ho1 ho1Var = (ho1) c1283w7.f33126b;
            if (!((ho1Var.f20747b.containsKey(pn1Var.f27782e) && ho1Var.f20750e) ? ho1Var.f20751f : true)) {
                String str = pn1Var.f27785h;
                if (str != null && (pn1VarM12150z = c1283w7.m12150z(str)) != null && pn1VarM12150z.f27758C) {
                    pn1Var.f27784g = pn1VarM12150z;
                }
                pn1Var.f27778a = 0;
                return;
            }
        }
        rn1 rn1Var = pn1Var.f27798u;
        if (rn1Var != null) {
            z = ((ho1) c1283w7.f33126b).f20751f;
        } else {
            EsActivity esActivity = rn1Var.f29431v;
            z = esActivity != null ? !esActivity.isChangingConfigurations() : true;
        }
        if (b3 != false || z) {
            ((ho1) c1283w7.f33126b).m6460c(pn1Var, false);
        }
        pn1Var.f27799v.m5254m();
        i50 i50Var = pn1Var.f27774S;
        ln1 ln1Var = new ln1(b2 == true ? 1 : 0);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)");
        pn1Var.f27778a = 0;
        pn1Var.f27760E = false;
        pn1Var.f27766K = false;
        ln1 ln1Var2 = new ln1(b);
        ln1Var2.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var2, "Fragment#onDestroy");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onDestroy()");
            return;
        }
        this.f24222a.m8754s(pn1Var, false);
        ArrayList arrayListM12117D = c1283w7.m12117D();
        int size = arrayListM12117D.size();
        while (i < size) {
            Object obj = arrayListM12117D.get(i);
            i++;
            lo1 lo1Var = (lo1) obj;
            if (lo1Var != null) {
                pn1 pn1Var2 = lo1Var.f24224c;
                if (pn1Var.f27782e.equals(pn1Var2.f27785h)) {
                    pn1Var2.f27784g = pn1Var;
                    pn1Var2.f27785h = null;
                }
            }
        }
        String str2 = pn1Var.f27785h;
        if (str2 != null) {
            pn1Var.f27784g = c1283w7.m12150z(str2);
        }
        c1283w7.m12124K(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m8050g() throws Exception {
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + pn1Var);
        }
        ViewGroup viewGroup = pn1Var.f27761F;
        i50 i50Var = pn1Var.f27774S;
        pn1Var.f27799v.m5263v(1);
        pn1Var.f27778a = 1;
        pn1Var.f27760E = false;
        ln1 ln1Var = new ln1((byte) 5);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "Fragment#onDestroyView");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onDestroyView()");
            return;
        }
        ra4 ra4Var = ((nm2) z32.m13299D(pn1Var).f35739c).f25945b;
        if (ra4Var.f29121c > 0) {
            ra4Var.m10257d(0).getClass();
            xy4.m12778e();
            return;
        }
        pn1Var.f27795r = false;
        this.f24222a.m8736B(pn1Var, false);
        pn1Var.f27761F = null;
        pn1Var.f27771P = null;
        pn1Var.f27772Q.m10132e(null);
        pn1Var.f27792o = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m8051h() throws Exception {
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f24224c);
        }
        pn1 pn1Var = this.f24224c;
        pn1Var.f27778a = -1;
        pn1Var.f27760E = false;
        i50 i50Var = pn1Var.f27774S;
        ln1 ln1Var = new ln1((byte) 2);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "Fragment#onDetach");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onDetach()");
            return;
        }
        eo1 eo1Var = pn1Var.f27799v;
        if (!eo1Var.f18297J) {
            eo1Var.m5254m();
            pn1Var.f27799v = new eo1();
        }
        this.f24222a.m8755t(this.f24224c, false);
        pn1 pn1Var2 = this.f24224c;
        pn1Var2.f27778a = -1;
        pn1Var2.f27798u = null;
        pn1Var2.f27770O.f36357b = null;
        pn1 pn1Var3 = this.f24224c;
        pn1Var3.f27800w = null;
        pn1Var3.f27797t = null;
        if (!pn1Var3.f27789l || pn1Var3.m9583k()) {
            ho1 ho1Var = (ho1) this.f24223b.f33126b;
            if (!((ho1Var.f20747b.containsKey(this.f24224c.f27782e) && ho1Var.f20750e) ? ho1Var.f20751f : true)) {
                return;
            }
        }
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f24224c);
        }
        this.f24224c.m9581i();
    }

    /* JADX INFO: renamed from: i */
    public final void m8052i() {
        pn1 pn1Var = this.f24224c;
        if (pn1Var.f27791n && pn1Var.f27792o && !pn1Var.f27795r) {
            if (eo1.m5212J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + pn1Var);
            }
            Bundle bundle = pn1Var.f27779b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            pn1Var.mo8910u(pn1Var.mo8906q(bundle2), null, bundle2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8053j() {
        C1283w7 c1283w7 = this.f24223b;
        pn1 pn1Var = this.f24224c;
        if (this.f24225d) {
            if (eo1.m5212J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + pn1Var);
                return;
            }
            return;
        }
        try {
            this.f24225d = true;
            boolean z = false;
            while (true) {
                int iM8046c = m8046c();
                int i = pn1Var.f27778a;
                if (iM8046c == i) {
                    if (!z && i == -1 && pn1Var.f27789l && !pn1Var.m9583k()) {
                        if (eo1.m5212J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + pn1Var);
                        }
                        ((ho1) c1283w7.f33126b).m6460c(pn1Var, true);
                        c1283w7.m12124K(this);
                        if (eo1.m5212J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + pn1Var);
                        }
                        pn1Var.m9581i();
                    }
                    if (pn1Var.f27765J) {
                        eo1 eo1Var = pn1Var.f27797t;
                        if (eo1Var != null && pn1Var.f27788k && eo1.m5213K(pn1Var)) {
                            eo1Var.f18294G = true;
                        }
                        pn1Var.f27765J = false;
                        pn1Var.f27799v.m5257p();
                    }
                    return;
                }
                if (iM8046c <= i) {
                    switch (i - 1) {
                        case -1:
                            m8051h();
                            break;
                        case 0:
                            m8049f();
                            break;
                        case 1:
                            m8050g();
                            pn1Var.f27778a = 1;
                            break;
                        case 2:
                            pn1Var.f27792o = false;
                            pn1Var.f27778a = 2;
                            break;
                        case 3:
                            if (eo1.m5212J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + pn1Var);
                            }
                            pn1Var.f27778a = 3;
                            break;
                        case 4:
                            m8058o();
                            break;
                        case 5:
                            pn1Var.f27778a = 5;
                            break;
                        case 6:
                            m8054k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m8045b();
                            break;
                        case 1:
                            m8047d();
                            break;
                        case 2:
                            m8052i();
                            m8048e();
                            break;
                        case 3:
                            m8044a();
                            break;
                        case 4:
                            pn1Var.f27778a = 4;
                            break;
                        case 5:
                            m8057n();
                            break;
                        case 6:
                            pn1Var.f27778a = 6;
                            break;
                        case 7:
                            m8056m();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.f24225d = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8054k() throws Exception {
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + pn1Var);
        }
        i50 i50Var = pn1Var.f27774S;
        eo1 eo1Var = pn1Var.f27799v;
        if (eo1Var.f18311h != null) {
            eo1Var.m5243d();
        }
        eo1Var.m5263v(5);
        ln1 ln1Var = new ln1((byte) 14);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)");
        pn1Var.f27778a = 6;
        pn1Var.f27760E = false;
        ln1 ln1Var2 = new ln1((byte) 15);
        ln1Var2.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var2, "Fragment#onPause");
        if (pn1Var.f27760E) {
            this.f24222a.m8756u(pn1Var, false);
        } else {
            wb1.m12189c(pn1Var, " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8055l(ClassLoader classLoader) {
        pn1 pn1Var = this.f24224c;
        Bundle bundle = pn1Var.f27779b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (pn1Var.f27779b.getBundle("savedInstanceState") == null) {
            pn1Var.f27779b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            pn1Var.f27780c = pn1Var.f27779b.getSparseParcelableArray("viewState");
            pn1Var.f27781d = pn1Var.f27779b.getBundle("viewRegistryState");
            ko1 ko1Var = (ko1) pn1Var.f27779b.getParcelable("state");
            if (ko1Var != null) {
                pn1Var.f27785h = ko1Var.f23283m;
                pn1Var.f27786i = ko1Var.f23284n;
                pn1Var.f27763H = ko1Var.f23285o;
            }
            if (pn1Var.f27763H) {
                return;
            }
            pn1Var.f27762G = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + pn1Var, e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8056m() throws Exception {
        pn1 pn1Var = this.f24224c;
        byte b = 3;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + pn1Var);
        }
        on1 on1Var = pn1Var.f27764I;
        View view = on1Var == null ? null : on1Var.f26908i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        pn1Var.m9576d().f26908i = null;
        pn1Var.f27799v.m5227P();
        pn1Var.f27799v.m5217A(true);
        pn1Var.f27778a = 7;
        pn1Var.f27760E = false;
        i50 i50Var = pn1Var.f27774S;
        ln1 ln1Var = new ln1(b);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "Fragment#onResume");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onResume()");
            return;
        }
        ln1 ln1Var2 = new ln1((byte) 4);
        ln1Var2.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var2, "FragmentLifecycle#handleLifecycleEvent(ON_RESUME)");
        eo1 eo1Var = pn1Var.f27799v;
        eo1Var.f18295H = false;
        eo1Var.f18296I = false;
        eo1Var.f18302O.f20752g = false;
        eo1Var.m5263v(7);
        this.f24222a.m8759x(pn1Var, false);
        this.f24223b.m12129P(pn1Var.f27782e, null);
        pn1Var.f27779b = null;
        pn1Var.f27780c = null;
        pn1Var.f27781d = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m8057n() throws Exception {
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + pn1Var);
        }
        pn1Var.f27799v.m5227P();
        pn1Var.f27799v.m5217A(true);
        pn1Var.f27778a = 5;
        pn1Var.f27760E = false;
        i50 i50Var = pn1Var.f27774S;
        ln1 ln1Var = new ln1((byte) 11);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "Fragment#onStart");
        if (!pn1Var.f27760E) {
            wb1.m12189c(pn1Var, " did not call through to super.onStart()");
            return;
        }
        ln1 ln1Var2 = new ln1((byte) 12);
        ln1Var2.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var2, "FragmentLifecycle#handleLifecycleEvent(ON_START)");
        eo1 eo1Var = pn1Var.f27799v;
        eo1Var.f18295H = false;
        eo1Var.f18296I = false;
        eo1Var.f18302O.f20752g = false;
        eo1Var.m5263v(5);
        this.f24222a.m8761z(pn1Var, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m8058o() throws Exception {
        pn1 pn1Var = this.f24224c;
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + pn1Var);
        }
        i50 i50Var = pn1Var.f27774S;
        eo1 eo1Var = pn1Var.f27799v;
        eo1Var.f18296I = true;
        eo1Var.f18302O.f20752g = true;
        eo1Var.m5263v(4);
        ln1 ln1Var = new ln1((byte) 8);
        ln1Var.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var, "FragmentLifecycle#handleLifecycleEvent(ON_STOP)");
        pn1Var.f27778a = 4;
        pn1Var.f27760E = false;
        ln1 ln1Var2 = new ln1((byte) 9);
        ln1Var2.f24197b = pn1Var;
        VarHandle.storeStoreFence();
        i50Var.m6673k(ln1Var2, "Fragment#onStop");
        if (pn1Var.f27760E) {
            this.f24222a.m8735A(pn1Var, false);
        } else {
            wb1.m12189c(pn1Var, " did not call through to super.onStop()");
        }
    }
}
