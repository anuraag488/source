package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements vq4, Cloneable {

    /* JADX INFO: renamed from: c */
    public static final qb1 f28357c = new qb1();

    /* JADX INFO: renamed from: a */
    public final List f28358a;

    /* JADX INFO: renamed from: b */
    public final List f28359b;

    public qb1() {
        List list = Collections.EMPTY_LIST;
        this.f28358a = list;
        this.f28359b = list;
    }

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        Class cls = cs4Var.f16429a;
        boolean zM9860b = m9860b(cls, true);
        boolean zM9860b2 = m9860b(cls, false);
        if (!zM9860b && !zM9860b2) {
            return null;
        }
        pb1 pb1Var = new pb1();
        pb1Var.f27509f = this;
        pb1Var.f27505b = zM9860b2;
        pb1Var.f27506c = zM9860b;
        pb1Var.f27507d = ou1Var;
        pb1Var.f27508e = cs4Var;
        VarHandle.storeStoreFence();
        return pb1Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9860b(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            c20 c20Var = vl3.f32723a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f28358a : this.f28359b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        xy4.m12778e();
        return false;
    }

    public final Object clone() {
        try {
            return (qb1) super.clone();
        } catch (CloneNotSupportedException e) {
            C1077qn.m9985k(e);
            return null;
        }
    }
}
