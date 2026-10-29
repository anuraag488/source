package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u25 {

    /* JADX INFO: renamed from: a */
    public WorkDatabase f31629a;

    /* JADX INFO: renamed from: b */
    public qy0 f31630b;

    /* JADX INFO: renamed from: a */
    public final f25 m11209a(String str) {
        WorkDatabase workDatabase = this.f31629a;
        C1051py c1051py = new C1051py((byte) 14);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        return (f25) as4.m3231J(workDatabase, true, false, c1051py);
    }

    /* JADX INFO: renamed from: b */
    public final q25 m11210b(String str) {
        WorkDatabase workDatabase = this.f31629a;
        C1051py c1051py = new C1051py((byte) 13);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        return (q25) as4.m3231J(workDatabase, true, false, c1051py);
    }

    /* JADX INFO: renamed from: c */
    public final void m11211c(String str, long j) {
        WorkDatabase workDatabase = this.f31629a;
        r25 r25Var = new r25((byte) 1);
        r25Var.f28975b = j;
        r25Var.f28976c = str;
        VarHandle.storeStoreFence();
        ((Number) as4.m3231J(workDatabase, false, true, r25Var)).intValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m11212d(int i, String str) {
        WorkDatabase workDatabase = this.f31629a;
        jg4 jg4Var = new jg4((byte) 1);
        jg4Var.f22258b = str;
        jg4Var.f22259c = i;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, jg4Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m11213e(String str, long j) {
        WorkDatabase workDatabase = this.f31629a;
        r25 r25Var = new r25((byte) 0);
        r25Var.f28975b = j;
        r25Var.f28976c = str;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, r25Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m11214f(f25 f25Var, String str) {
        WorkDatabase workDatabase = this.f31629a;
        cz3 cz3Var = new cz3((byte) 25);
        cz3Var.f16638b = f25Var;
        cz3Var.f16639c = str;
        VarHandle.storeStoreFence();
        ((Number) as4.m3231J(workDatabase, false, true, cz3Var)).intValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m11215g(int i, String str) {
        WorkDatabase workDatabase = this.f31629a;
        jg4 jg4Var = new jg4((byte) 2);
        jg4Var.f22259c = i;
        jg4Var.f22258b = str;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, jg4Var);
    }
}
