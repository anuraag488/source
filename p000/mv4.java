package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv4 implements cg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25244a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wo5 f25245b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C0588dv f25246c;

    public /* synthetic */ mv4(byte b) {
        this.f25244a = b;
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public final Object mo4024d() {
        Boolean bool;
        switch (this.f25244a) {
            case 0:
                wo5 wo5Var = this.f25245b;
                C0588dv c0588dv = this.f25246c;
                pt3 pt3Var = (pt3) wo5Var.f33568c;
                SQLiteDatabase sQLiteDatabaseM9671a = pt3Var.m9671a();
                sQLiteDatabaseM9671a.beginTransaction();
                try {
                    Long lM9668b = pt3.m9668b(sQLiteDatabaseM9671a, c0588dv);
                    if (lM9668b == null) {
                        bool = Boolean.FALSE;
                    } else {
                        Cursor cursorRawQuery = pt3Var.m9671a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM9668b.toString()});
                        try {
                            Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                            cursorRawQuery.close();
                            bool = boolValueOf;
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    sQLiteDatabaseM9671a.setTransactionSuccessful();
                    sQLiteDatabaseM9671a.endTransaction();
                    return bool;
                } catch (Throwable th2) {
                    sQLiteDatabaseM9671a.endTransaction();
                    throw th2;
                }
            default:
                wo5 wo5Var2 = this.f25245b;
                C0588dv c0588dv2 = this.f25246c;
                pt3 pt3Var2 = (pt3) wo5Var2.f33568c;
                pt3Var2.getClass();
                C1163sz c1163sz = new C1163sz((byte) 14);
                c1163sz.f30676b = pt3Var2;
                c1163sz.f30677c = c0588dv2;
                VarHandle.storeStoreFence();
                return (Iterable) pt3Var2.m9672e(c1163sz);
        }
    }
}
