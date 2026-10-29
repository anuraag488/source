package p000;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 {

    /* JADX INFO: renamed from: a */
    public String f27571a = null;

    /* JADX INFO: renamed from: b */
    public HashSet f27572b;

    /* JADX INFO: renamed from: c */
    public HashSet f27573c;

    /* JADX INFO: renamed from: d */
    public byte f27574d;

    /* JADX INFO: renamed from: e */
    public boolean f27575e;

    /* JADX INFO: renamed from: f */
    public gg0 f27576f;

    /* JADX INFO: renamed from: g */
    public HashSet f27577g;

    public pf0(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.f27572b = hashSet;
        this.f27573c = new HashSet();
        this.f27574d = (byte) 0;
        this.f27575e = false;
        this.f27577g = new HashSet();
        hashSet.add(ni3.m8779a(cls));
        for (Class cls2 : clsArr) {
            ev0.m5342Q(cls2, "Null interface");
            this.f27572b.add(ni3.m8779a(cls2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9509a(ny0 ny0Var) {
        if (this.f27572b.contains(ny0Var.f26188a)) {
            C1077qn.m9987m("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.f27573c.add(ny0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final qf0 m9510b() {
        if (!(this.f27576f != null)) {
            C1077qn.m9989o("Missing required property: factory.");
            return null;
        }
        return new qf0(this.f27571a, new HashSet(this.f27572b), new HashSet(this.f27573c), this.f27574d, this.f27575e ? 1 : 0, this.f27576f, this.f27577g);
    }

    /* JADX INFO: renamed from: c */
    public final void m9511c() {
        if (this.f27574d == 0) {
            this.f27574d = (byte) 2;
        } else {
            C1077qn.m9989o("Instantiation type has already been set.");
        }
    }
}
