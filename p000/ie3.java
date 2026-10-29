package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ie3 implements uh2 {

    /* JADX INFO: renamed from: a */
    public final int f21287a;

    /* JADX INFO: renamed from: b */
    public final tt2 f21288b;

    /* JADX INFO: renamed from: c */
    public final yp1 f21289c;

    /* JADX INFO: renamed from: d */
    public kl0 f21290d;

    /* JADX INFO: renamed from: e */
    public de4 f21291e;

    /* JADX INFO: renamed from: f */
    public ce4 f21292f;

    /* JADX INFO: renamed from: g */
    public boolean f21293g;

    /* JADX INFO: renamed from: h */
    public boolean f21294h;

    /* JADX INFO: renamed from: i */
    public boolean f21295i;

    /* JADX INFO: renamed from: j */
    public Object f21296j;

    /* JADX INFO: renamed from: k */
    public boolean f21297k;

    /* JADX INFO: renamed from: l */
    public he3 f21298l;

    /* JADX INFO: renamed from: m */
    public boolean f21299m;

    /* JADX INFO: renamed from: n */
    public long f21300n;

    /* JADX INFO: renamed from: o */
    public long f21301o;

    /* JADX INFO: renamed from: p */
    public long f21302p = wt2.m12419a();

    /* JADX INFO: renamed from: q */
    public boolean f21303q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1126rz f21304r;

    public ie3(C1126rz c1126rz, int i, tt2 tt2Var, el1 el1Var) {
        this.f21304r = c1126rz;
        this.f21287a = i;
        this.f21288b = tt2Var;
        this.f21289c = el1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6773a() {
        ce4 ce4Var = this.f21292f;
        if (ce4Var != null) {
            ce4Var.cancel();
        }
        this.f21292f = null;
        de4 de4Var = this.f21291e;
        if (de4Var != null) {
            de4Var.mo4491a();
        }
        this.f21291e = null;
        this.f21298l = null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6774b(C1291wf c1291wf) {
        boolean zM6775c;
        if (!this.f21304r.f29737a) {
            return false;
        }
        if (this.f21299m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM6775c = m6775c(c1291wf);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zM6775c = m6775c(c1291wf);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zM6775c;
    }

    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: c */
    public final boolean m6775c(p000.C1291wf r26) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ie3.m6775c(wf):boolean");
    }

    @Override // p000.uh2
    public final void cancel() {
        if (this.f21294h) {
            return;
        }
        this.f21294h = true;
        m6773a();
    }

    @Override // p000.uh2
    /* JADX INFO: renamed from: d */
    public final void mo6776d() {
        this.f21299m = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6777e() {
        ce4 ce4Var;
        return this.f21295i || ((ce4Var = this.f21292f) != null && ce4Var.mo3992m());
    }

    /* JADX INFO: renamed from: f */
    public final void m6778f(Object obj, Object obj2, C0775iv c0775iv) {
        ce4 ce4Var;
        ce4 ce4Var2 = this.f21292f;
        boolean z = false;
        ce4 ce4Var3 = ce4Var2;
        if (ce4Var2 == null) {
            C1126rz c1126rz = this.f21304r;
            mq1 mq1VarM7969a = ((lh2) c1126rz.f29738b).m7969a(this.f21287a, obj, obj2);
            jg2 jg2VarM5105a = ((ee4) c1126rz.f29739c).m5105a();
            if (jg2VarM5105a.f22230a.m12256J()) {
                jg2VarM5105a.m7099l(obj, mq1VarM7969a, true);
                nh3 nh3Var = new nh3((byte) 19, z);
                nh3Var.f25810b = jg2VarM5105a;
                nh3Var.f25811c = obj;
                VarHandle.storeStoreFence();
                ce4Var = nh3Var;
            } else {
                z32 z32Var = new z32((byte) 17);
                z32Var.f35738b = jg2VarM5105a;
                z32Var.f35739c = obj;
                VarHandle.storeStoreFence();
                ce4Var = z32Var;
            }
            ce4 ce4Var4 = ce4Var;
            this.f21292f = ce4Var4;
            this.f21296j = obj;
            ce4Var3 = ce4Var4;
        }
        this.f21303q = false;
        while (!ce4Var3.mo3992m() && !this.f21303q) {
            C1163sz c1163sz = new C1163sz((byte) 11);
            c1163sz.f30676b = this;
            c1163sz.f30677c = c0775iv;
            VarHandle.storeStoreFence();
            ce4Var3.mo3993o(c1163sz);
        }
        m6781i();
        boolean z2 = this.f21303q;
        long j = this.f21301o;
        if (z2) {
            c0775iv.f21813b = C0775iv.m6941a(j, c0775iv.f21813b);
        } else {
            c0775iv.f21812a = C0775iv.m6941a(j, c0775iv.f21812a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final he3 m6779g() {
        de4 de4Var = this.f21291e;
        if (de4Var == null) {
            throw d55.m4375t("Should precompose before resolving nested prefetch states");
        }
        ql3 ql3Var = new ql3();
        C0607ec c0607ec = new C0607ec((byte) 4);
        c0607ec.f17957b = ql3Var;
        VarHandle.storeStoreFence();
        de4Var.mo4492b(c0607ec);
        List list = (List) ql3Var.f28555a;
        if (list == null) {
            return null;
        }
        he3 he3Var = new he3();
        he3Var.f20521f = this;
        he3Var.f20516a = list;
        he3Var.f20517b = new List[list.size()];
        if (!list.isEmpty()) {
            VarHandle.storeStoreFence();
            return he3Var;
        }
        t32.m10968a("NestedPrefetchController shouldn't be created with no states");
        VarHandle.storeStoreFence();
        return he3Var;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6780h(long j, long j2) {
        if (this.f21299m) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX INFO: renamed from: i */
    public final void m6781i() {
        long jM10085J;
        long jM12419a = wt2.m12419a();
        long j = this.f21302p;
        m41 m41Var = m41.NANOSECONDS;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jM10085J = (1 | (jM12419a - 1)) == Long.MAX_VALUE ? qs5.m10085J(jM12419a) : qs5.m10091P(jM12419a, j);
        } else if (jM12419a == j) {
            r50 r50Var = i41.f21117b;
            jM10085J = 0;
        } else {
            jM10085J = i41.m6657p(qs5.m10085J(j));
        }
        long j3 = jM10085J >> 1;
        r50 r50Var2 = i41.f21117b;
        if ((((int) jM10085J) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.f21301o = j2;
        long j4 = this.f21300n - j2;
        this.f21300n = j4;
        this.f21302p = jM12419a;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f21287a + ", constraints = " + this.f21290d + ", isComposed = " + m6777e() + ", isMeasured = " + this.f21293g + ", isCanceled = " + this.f21294h + " }";
    }
}
