package p000;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo1 implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ hf0 f32761a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ js1 f32762b;

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        hf0 hf0Var = this.f32761a;
        js1 js1Var = this.f32762b;
        int i = yo1.f35392h;
        uo1 uo1Var = (uo1) js1Var.f22555a;
        if (uo1Var == null || !uo1Var.f32025a.equals(sQLiteDatabase)) {
            uo1Var = new uo1();
            uo1Var.f32025a = sQLiteDatabase;
            VarHandle.storeStoreFence();
            js1Var.f22555a = uo1Var;
        }
        SQLiteDatabase sQLiteDatabase2 = uo1Var.f32025a;
        hf0Var.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + uo1Var + ".path");
        if (!sQLiteDatabase2.isOpen()) {
            String path = sQLiteDatabase2.getPath();
            if (path != null) {
                hf0.m6369i(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                uo1Var.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    hf0.m6369i((String) ((Pair) it.next()).second);
                }
            } else {
                String path2 = sQLiteDatabase2.getPath();
                if (path2 != null) {
                    hf0.m6369i(path2);
                }
            }
        }
    }
}
