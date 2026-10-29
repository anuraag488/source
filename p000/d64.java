package p000;

import java.lang.invoke.VarHandle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d64 {

    /* JADX INFO: renamed from: a */
    public final Set f16817a;

    /* JADX INFO: renamed from: b */
    public final wp1 f16818b;

    /* JADX INFO: renamed from: c */
    public final yp1 f16819c;

    /* JADX INFO: renamed from: d */
    public final C0940nb f16820d;

    /* JADX INFO: renamed from: e */
    public ag1 f16821e;

    /* JADX INFO: renamed from: f */
    public ag1 f16822f;

    public d64(Set set, wp1 wp1Var, e64 e64Var, yp1 yp1Var) {
        this.f16817a = set;
        this.f16818b = wp1Var;
        this.f16819c = yp1Var;
        if (!set.contains(e64.f17843b)) {
            C1077qn.m9987m("Expanded must be one of the enabled values.");
            throw null;
        }
        if (!set.contains(e64Var)) {
            C1077qn.m9987m("The initial value must be one of the enabled values.");
            throw null;
        }
        int i = v54.f32423a;
        byte b = 0;
        C0940nb c0940nb = new C0940nb(b);
        c0940nb.f25605b = new C0891m((byte) 9);
        c0940nb.f25606c = new dx2();
        c0940nb.f25607d = k43.m7398w(e64Var);
        c0940nb.f25608e = k43.m7398w(e64Var);
        C0756ib c0756ib = new C0756ib(b);
        c0756ib.f21241b = c0940nb;
        VarHandle.storeStoreFence();
        c0940nb.f25611h = s94.m10566b(c0756ib);
        c0940nb.f25612i = new z73(Float.NaN);
        new C1339xp(0);
        k94.m7451h().mo5015g();
        yv2 yv2Var = p23.f27324a;
        c0940nb.f25613j = new z73(0.0f);
        c0940nb.f25609f = k43.m7398w(null);
        C0891m c0891m = AbstractC0485bb.f15192a;
        c0940nb.f25610g = k43.m7398w(new uv0(v71.f32439a, new float[0]));
        C0903mb c0903mb = new C0903mb();
        c0903mb.f24793d = c0940nb;
        c0903mb.f24792c = Float.NaN;
        VarHandle.storeStoreFence();
        c0940nb.f25614k = c0903mb;
        c0940nb.f25605b = yp1Var;
        VarHandle.storeStoreFence();
        this.f16820d = c0940nb;
        this.f16821e = new d94();
        this.f16822f = new d94();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m4384a(w10 w10Var, float f, ym0 ym0Var) {
        b64 b64Var;
        nl3 nl3Var;
        if (ym0Var instanceof b64) {
            b64Var = (b64) ym0Var;
            int i = b64Var.f15127w;
            if ((i & Integer.MIN_VALUE) != 0) {
                b64Var.f15127w = i - Integer.MIN_VALUE;
            } else {
                b64Var = new b64(this, ym0Var);
            }
        } else {
            b64Var = new b64(this, ym0Var);
        }
        Object obj = b64Var.f15125u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = b64Var.f15127w;
        if (i2 == 0) {
            k43.m7376J(obj);
            nl3 nl3Var2 = new nl3();
            c64 c64Var = new c64(nl3Var2, w10Var, this, f, null);
            b64Var.f15124t = nl3Var2;
            b64Var.f15127w = 1;
            if (C0940nb.m8663d(this.f16820d, c64Var, b64Var) == ap0Var) {
                return ap0Var;
            }
            nl3Var = nl3Var2;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nl3Var = b64Var.f15124t;
            k43.m7376J(obj);
        }
        return new Float(nl3Var.f25933a);
    }

    /* JADX INFO: renamed from: b */
    public final Object m4385b(e64 e64Var, ag1 ag1Var, of4 of4Var) {
        C0891m c0891m = AbstractC0485bb.f15192a;
        C0940nb c0940nb = this.f16820d;
        Object objM8668c = c0940nb.m8668c(e64Var, xw2.f34665a, new C1324xa(c0940nb, ag1Var, null), of4Var);
        ap0 ap0Var = ap0.f14763a;
        ju4 ju4Var = ju4.f22634a;
        if (objM8668c != ap0Var) {
            objM8668c = ju4Var;
        }
        return objM8668c == ap0Var ? objM8668c : ju4Var;
    }

    /* JADX INFO: renamed from: c */
    public final e64 m4386c() {
        return (e64) ((d83) this.f16820d.f25608e).getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Object m4387d(of4 of4Var) {
        Object objM4385b;
        e64 e64Var = e64.f17842a;
        if (this.f16817a.contains(e64Var)) {
            return (((Boolean) this.f16819c.invoke(e64Var)).booleanValue() && (objM4385b = m4385b(e64Var, this.f16822f, of4Var)) == ap0.f14763a) ? objM4385b : ju4.f22634a;
        }
        C1077qn.m9989o("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4388e() {
        return ((d83) this.f16820d.f25607d).getValue() != e64.f17842a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m4389f(of4 of4Var) {
        Object objM4385b;
        e64 e64Var = e64.f17844c;
        if (this.f16817a.contains(e64Var)) {
            return (((Boolean) this.f16819c.invoke(e64Var)).booleanValue() && (objM4385b = m4385b(e64Var, this.f16822f, of4Var)) == ap0.f14763a) ? objM4385b : ju4.f22634a;
        }
        C1077qn.m9989o("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4390g(of4 of4Var) {
        Object objM4385b;
        uv0 uv0VarM8670h = this.f16820d.m8670h();
        e64 e64Var = e64.f17844c;
        if (!uv0VarM8670h.m11653c(e64Var)) {
            e64Var = e64.f17843b;
        }
        return (((Boolean) this.f16819c.invoke(e64Var)).booleanValue() && (objM4385b = m4385b(e64Var, this.f16821e, of4Var)) == ap0.f14763a) ? objM4385b : ju4.f22634a;
    }
}
