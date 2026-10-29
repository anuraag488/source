package p000;

import ads_mobile_sdk.ut1;
import ads_mobile_sdk.yx0;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh0 implements oc6 {

    /* JADX INFO: renamed from: a */
    public Object f36084a;

    public zh0(byte b) {
        switch (b) {
            case 1:
                this.f36084a = new Object();
                break;
            case 2:
                this.f36084a = k43.m7398w(Boolean.FALSE);
                break;
            default:
                this.f36084a = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m13554a(nh5 nh5Var, ym0 ym0Var) {
        ut1 ut1Var;
        Iterator it;
        Object obj;
        if (ym0Var instanceof ut1) {
            ut1Var = (ut1) ym0Var;
            int i = ut1Var.f12477e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ut1Var.f12477e = i - Integer.MIN_VALUE;
            } else {
                ut1Var = new ut1(this, ym0Var);
            }
        } else {
            ut1Var = new ut1(this, ym0Var);
        }
        Object obj2 = ut1Var.f12475c;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ut1Var.f12477e;
        if (i2 == 0) {
            k43.m7376J(obj2);
            it = ((Map) this.f36084a).entrySet().iterator();
            obj = nh5Var;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = ut1Var.f12474b;
            Object obj3 = ut1Var.f12473a;
            k43.m7376J(obj2);
            obj = obj3;
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            k95 k95Var = (k95) entry.getValue();
            zi4.m13598A("Configuring JsContext with modifier [", str, "]", null);
            ut1Var.f12473a = obj;
            ut1Var.f12474b = it;
            ut1Var.f12477e = 1;
            if (k95Var.mo462a(obj, ut1Var) == ap0Var) {
                return ap0Var;
            }
        }
        return ju4.f22634a;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: b */
    public d76 mo9019b() {
        throw null;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: c */
    public ea6 mo9020c() {
        throw null;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: d */
    public Context mo9021d() {
        throw null;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: e */
    public ia5 mo9022e() {
        throw null;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: f */
    public yj5 mo9023f() {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m13555g(int i, kr1 kr1Var, Object obj) {
        ArrayList arrayList = kr1Var.f23350a;
        if (arrayList == null) {
            m13556h(i, kr1Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof cr1)) {
                if (!(obj2 instanceof kr1)) {
                    nm0.m8798k(obj2, "Unexpected child source info ");
                    break;
                }
                if (m13555g(i, (kr1) obj2, obj)) {
                    m13556h(0, kr1Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m13556h(0, kr1Var, obj2);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m13556h(int i, kr1 kr1Var, Object obj) {
        ((ArrayList) this.f36084a).add(new ai0(i, null, null));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo4394i(y14 y14Var);

    /* JADX INFO: renamed from: j */
    public abstract void mo4395j();

    /* JADX INFO: renamed from: k */
    public abstract void mo4396k();

    /* JADX INFO: renamed from: l */
    public abstract Object mo11188l();

    /* JADX INFO: renamed from: m */
    public abstract Object mo11189m();

    /* JADX INFO: renamed from: n */
    public void m13557n(int i, Object obj, kr1 kr1Var, Object obj2) {
        if (z62.m13387o(obj, ki0.f23136a)) {
            m13556h(i, kr1Var, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract yp1 mo4397o(y14 y14Var);

    /* JADX INFO: renamed from: p */
    public abstract void mo4398p(b80 b80Var);

    /* JADX INFO: renamed from: q */
    public abstract void mo11190q(Object obj);

    /* JADX INFO: renamed from: t */
    public void mo5038t() {
        ea6 ea6Var = ((oa6) this.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
    }

    public zh0(oa6 oa6Var) {
        y42.m12854a0(oa6Var);
        this.f36084a = oa6Var;
    }

    /* JADX INFO: renamed from: a */
    public r75 mo464a() {
        return (r75) this.f36084a;
    }

    /* JADX INFO: renamed from: a */
    public Object m13553a(String str, Object obj, yp1 yp1Var) {
        Object objM2771a = ((yx0) ((mk5) this.f36084a)).m2771a(str, yp1Var);
        return objM2771a == null ? obj : objM2771a;
    }

    /* JADX INFO: renamed from: r */
    public void mo13279r(dp4 dp4Var) {
    }

    /* JADX INFO: renamed from: s */
    public void mo13280s() {
    }
}
