package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kg4 {

    /* JADX INFO: renamed from: a */
    public WorkDatabase f23111a;

    /* JADX INFO: renamed from: b */
    public qy0 f23112b;

    /* JADX INFO: renamed from: a */
    public final ig4 m7515a(e25 e25Var) {
        String str = e25Var.f17648a;
        int i = e25Var.f17649b;
        WorkDatabase workDatabase = this.f23111a;
        jg4 jg4Var = new jg4((byte) 0);
        jg4Var.f22258b = str;
        jg4Var.f22259c = i;
        VarHandle.storeStoreFence();
        return (ig4) as4.m3231J(workDatabase, true, false, jg4Var);
    }
}
