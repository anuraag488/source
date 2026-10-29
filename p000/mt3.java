package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt3 implements nt3, cg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25209a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pt3 f25210b;

    public /* synthetic */ mt3(byte b) {
        this.f25209a = b;
    }

    @Override // p000.nt3
    public Object apply(Object obj) {
        pt3 pt3Var = this.f25210b;
        Cursor cursor = (Cursor) obj;
        pt3Var.getClass();
        while (cursor.moveToNext()) {
            pt3Var.m9674j(cursor.getInt(0), ln2.f24199c, cursor.getString(1));
        }
        return null;
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public Object mo4024d() {
        byte b = this.f25209a;
        byte b2 = 0;
        pt3 pt3Var = this.f25210b;
        switch (b) {
            case 1:
                pt3Var.getClass();
                int i = ea0.f17917e;
                C1283w7 c1283w7 = new C1283w7((byte) 4);
                c1283w7.f33127c = null;
                c1283w7.f33128d = new ArrayList();
                c1283w7.f33129e = null;
                c1283w7.f33126b = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM9671a = pt3Var.m9671a();
                sQLiteDatabaseM9671a.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM9671a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]);
                    ck0 ck0Var = new ck0((byte) 6);
                    ck0Var.f16074b = pt3Var;
                    ck0Var.f16075c = map;
                    ck0Var.f16076d = c1283w7;
                    VarHandle.storeStoreFence();
                    ea0 ea0Var = (ea0) pt3.m9670q(cursorRawQuery, ck0Var);
                    sQLiteDatabaseM9671a.setTransactionSuccessful();
                    return ea0Var;
                } finally {
                    sQLiteDatabaseM9671a.endTransaction();
                }
            default:
                long jMo5609j = pt3Var.f27973b.mo5609j() - pt3Var.f27975d.f15601d;
                lt3 lt3Var = new lt3(b2);
                lt3Var.f24356c = pt3Var;
                lt3Var.f24355b = jMo5609j;
                VarHandle.storeStoreFence();
                Integer num = (Integer) pt3Var.m9672e(lt3Var);
                num.intValue();
                return num;
        }
    }
}
