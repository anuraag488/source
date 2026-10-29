package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pt3 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final j81 f27971f = j81.m7046a("proto");

    /* JADX INFO: renamed from: a */
    public iw3 f27972a;

    /* JADX INFO: renamed from: b */
    public ja0 f27973b;

    /* JADX INFO: renamed from: c */
    public ja0 f27974c;

    /* JADX INFO: renamed from: d */
    public C0504bu f27975d;

    /* JADX INFO: renamed from: e */
    public ai3 f27976e;

    /* JADX INFO: renamed from: b */
    public static Long m9668b(SQLiteDatabase sQLiteDatabase, C0588dv c0588dv) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c0588dv.f17420a, String.valueOf(bg3.m3588a(c0588dv.f17422c))));
        byte[] bArr = c0588dv.f17421b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m9669l(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C1010ou) it.next()).f27100a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static Object m9670q(Cursor cursor, nt3 nt3Var) {
        try {
            return nt3Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m9671a() {
        iw3 iw3Var = this.f27972a;
        Objects.requireNonNull(iw3Var);
        ja0 ja0Var = this.f27974c;
        long jMo5609j = ja0Var.mo5609j();
        while (true) {
            try {
                return iw3Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (ja0Var.mo5609j() >= ((long) this.f27975d.f15600c) + jMo5609j) {
                    throw new bg4("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27972a.close();
    }

    /* JADX INFO: renamed from: e */
    public final Object m9672e(nt3 nt3Var) {
        SQLiteDatabase sQLiteDatabaseM9671a = m9671a();
        sQLiteDatabaseM9671a.beginTransaction();
        try {
            Object objApply = nt3Var.apply(sQLiteDatabaseM9671a);
            sQLiteDatabaseM9671a.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM9671a.endTransaction();
        }
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m9673g(SQLiteDatabase sQLiteDatabase, C0588dv c0588dv, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM9668b = m9668b(sQLiteDatabase, c0588dv);
        if (lM9668b == null) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM9668b.toString()}, null, null, null, String.valueOf(i));
        ck0 ck0Var = new ck0((byte) 8);
        ck0Var.f16074b = this;
        ck0Var.f16075c = arrayList;
        ck0Var.f16076d = c0588dv;
        VarHandle.storeStoreFence();
        m9670q(cursorQuery, ck0Var);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m9674j(long j, ln2 ln2Var, String str) {
        yj0 yj0Var = new yj0();
        yj0Var.f35261b = str;
        yj0Var.f35262c = ln2Var;
        yj0Var.f35260a = j;
        VarHandle.storeStoreFence();
        m9672e(yj0Var);
    }

    /* JADX INFO: renamed from: k */
    public final Object m9675k(cg4 cg4Var) {
        SQLiteDatabase sQLiteDatabaseM9671a = m9671a();
        ja0 ja0Var = this.f27974c;
        long jMo5609j = ja0Var.mo5609j();
        while (true) {
            try {
                sQLiteDatabaseM9671a.beginTransaction();
                try {
                    Object objMo4024d = cg4Var.mo4024d();
                    sQLiteDatabaseM9671a.setTransactionSuccessful();
                    return objMo4024d;
                } finally {
                    sQLiteDatabaseM9671a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (ja0Var.mo5609j() >= ((long) this.f27975d.f15600c) + jMo5609j) {
                    throw new bg4("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
