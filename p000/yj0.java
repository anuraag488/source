package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj0 implements xm0, gx0, nt3, cg4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f35260a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f35261b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35262c;

    @Override // p000.nt3
    public Object apply(Object obj) {
        String str = (String) this.f35261b;
        ln2 ln2Var = (ln2) this.f35262c;
        long j = this.f35260a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ln2Var.f24206a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p000.gx0
    /* JADX INFO: renamed from: c */
    public void mo6188c(bi3 bi3Var) {
        ((sp0) bi3Var.get()).m10891d((String) this.f35261b, this.f35260a, (C1381yu) this.f35262c);
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public Object mo4024d() {
        wo5 wo5Var = (wo5) this.f35261b;
        C0588dv c0588dv = (C0588dv) this.f35262c;
        long j = this.f35260a;
        pt3 pt3Var = (pt3) wo5Var.f33568c;
        long jMo5609j = ((ja0) wo5Var.f33572g).mo5609j() + j;
        pt3Var.getClass();
        lt3 lt3Var = new lt3((byte) 1);
        lt3Var.f24355b = jMo5609j;
        lt3Var.f24356c = c0588dv;
        VarHandle.storeStoreFence();
        pt3Var.m9672e(lt3Var);
        return null;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) {
        return ((wo5) this.f35261b).m12347b(nr6Var, this.f35260a, (HashMap) this.f35262c);
    }
}
