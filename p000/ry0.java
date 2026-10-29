package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 {

    /* JADX INFO: renamed from: a */
    public WorkDatabase f29725a;

    /* JADX INFO: renamed from: b */
    public qy0 f29726b;

    /* JADX INFO: renamed from: a */
    public final List m10497a(String str) {
        WorkDatabase workDatabase = this.f29725a;
        C1051py c1051py = new C1051py((byte) 2);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        return (List) as4.m3231J(workDatabase, true, false, c1051py);
    }
}
