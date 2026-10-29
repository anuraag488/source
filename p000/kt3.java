package p000;

import android.database.Cursor;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt3 implements nt3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f23429a;

    @Override // p000.nt3
    public final Object apply(Object obj) {
        long j = this.f23429a;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        long j2 = cursor.getLong(0);
        wm4 wm4Var = new wm4();
        wm4Var.f33505a = j2;
        wm4Var.f33506b = j;
        VarHandle.storeStoreFence();
        return wm4Var;
    }
}
