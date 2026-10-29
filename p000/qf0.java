package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a */
    public final String f28428a;

    /* JADX INFO: renamed from: b */
    public final Set f28429b;

    /* JADX INFO: renamed from: c */
    public final Set f28430c;

    /* JADX INFO: renamed from: d */
    public final byte f28431d;

    /* JADX INFO: renamed from: e */
    public final boolean f28432e;

    /* JADX INFO: renamed from: f */
    public final gg0 f28433f;

    /* JADX INFO: renamed from: g */
    public final Set f28434g;

    /* JADX WARN: Multi-variable type inference failed */
    public qf0(String str, Set set, Set set2, int i, int i2, gg0 gg0Var, Set set3) {
        this.f28428a = str;
        this.f28429b = Collections.unmodifiableSet(set);
        this.f28430c = Collections.unmodifiableSet(set2);
        this.f28431d = i;
        this.f28432e = i2;
        this.f28433f = gg0Var;
        this.f28434g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static pf0 m9879a(ni3 ni3Var) {
        pf0 pf0Var = new pf0();
        pf0Var.f27571a = null;
        HashSet hashSet = new HashSet();
        pf0Var.f27572b = hashSet;
        pf0Var.f27573c = new HashSet();
        pf0Var.f27574d = (byte) 0;
        pf0Var.f27575e = false;
        pf0Var.f27577g = new HashSet();
        hashSet.add(ni3Var);
        Collections.addAll(hashSet, new ni3[0]);
        VarHandle.storeStoreFence();
        return pf0Var;
    }

    /* JADX INFO: renamed from: b */
    public static pf0 m9880b(Class cls) {
        return new pf0(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: c */
    public static qf0 m9881c(Object obj, Class cls) {
        pf0 pf0VarM9880b = m9880b(cls);
        pf0VarM9880b.f27575e = true;
        of0 of0Var = new of0((byte) 0);
        of0Var.f26665b = obj;
        VarHandle.storeStoreFence();
        pf0VarM9880b.f27576f = of0Var;
        return pf0VarM9880b.m9510b();
    }

    /* JADX INFO: renamed from: d */
    public static qf0 m9882d(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(ni3.m8779a(cls));
        for (Class cls2 : clsArr) {
            ev0.m5342Q(cls2, "Null interface");
            hashSet.add(ni3.m8779a(cls2));
        }
        of0 of0Var = new of0((byte) 1);
        of0Var.f26665b = obj;
        VarHandle.storeStoreFence();
        return new qf0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, of0Var, hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f28429b.toArray()) + ">{" + ((int) this.f28431d) + ", type=" + (this.f28432e ? 1 : 0) + ", deps=" + Arrays.toString(this.f28430c.toArray()) + "}";
    }
}
