package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt3 implements nt3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24354a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f24355b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24356c;

    public /* synthetic */ lt3(byte b) {
        this.f24354a = b;
    }

    @Override // p000.nt3
    public final Object apply(Object obj) {
        switch (this.f24354a) {
            case 0:
                pt3 pt3Var = (pt3) this.f24356c;
                long j = this.f24355b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                pt3Var.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                mt3 mt3Var = new mt3((byte) 0);
                mt3Var.f25210b = pt3Var;
                VarHandle.storeStoreFence();
                pt3.m9670q(cursorRawQuery, mt3Var);
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                long j2 = this.f24355b;
                C0588dv c0588dv = (C0588dv) this.f24356c;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                String str = c0588dv.f17420a;
                ag3 ag3Var = c0588dv.f17422c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(bg3.m3588a(ag3Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(bg3.m3588a(ag3Var)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }
}
