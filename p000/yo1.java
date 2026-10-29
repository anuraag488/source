package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f35392h = 0;

    /* JADX INFO: renamed from: a */
    public final Context f35393a;

    /* JADX INFO: renamed from: b */
    public final js1 f35394b;

    /* JADX INFO: renamed from: c */
    public final hf0 f35395c;

    /* JADX INFO: renamed from: d */
    public final boolean f35396d;

    /* JADX INFO: renamed from: e */
    public boolean f35397e;

    /* JADX INFO: renamed from: f */
    public final eg3 f35398f;

    /* JADX INFO: renamed from: g */
    public boolean f35399g;

    public yo1(Context context, String str, js1 js1Var, hf0 hf0Var, boolean z) {
        Lock lock;
        int i = hf0Var.f20528b;
        vo1 vo1Var = new vo1();
        vo1Var.f32761a = hf0Var;
        vo1Var.f32762b = js1Var;
        VarHandle.storeStoreFence();
        super(context, str, null, i, vo1Var);
        this.f35393a = context;
        this.f35394b = js1Var;
        this.f35395c = hf0Var;
        this.f35396d = z;
        String string = str == null ? UUID.randomUUID().toString() : str;
        File cacheDir = context.getCacheDir();
        eg3 eg3Var = new eg3();
        eg3Var.f18073a = false;
        eg3Var.f18074b = cacheDir != null ? new File(cacheDir, string.concat(".lck")) : null;
        HashMap map = eg3.f18072e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(string);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(string, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        eg3Var.f18075c = lock;
        VarHandle.storeStoreFence();
        this.f35398f = eg3Var;
    }

    /* JADX INFO: renamed from: a */
    public final uo1 m13194a(boolean z) {
        eg3 eg3Var = this.f35398f;
        try {
            eg3Var.m5123a((this.f35399g || getDatabaseName() == null) ? false : true);
            this.f35397e = false;
            SQLiteDatabase sQLiteDatabaseM13196e = m13196e(z);
            if (!this.f35397e) {
                return m13195b(sQLiteDatabaseM13196e);
            }
            close();
            return m13194a(z);
        } finally {
            eg3Var.m5124b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final uo1 m13195b(SQLiteDatabase sQLiteDatabase) {
        js1 js1Var = this.f35394b;
        uo1 uo1Var = (uo1) js1Var.f22555a;
        if (uo1Var != null && uo1Var.f32025a.equals(sQLiteDatabase)) {
            return uo1Var;
        }
        uo1 uo1Var2 = new uo1();
        uo1Var2.f32025a = sQLiteDatabase;
        VarHandle.storeStoreFence();
        js1Var.f22555a = uo1Var2;
        return uo1Var2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        eg3 eg3Var = this.f35398f;
        try {
            eg3Var.m5123a(eg3Var.f18073a);
            super.close();
            this.f35394b.f22555a = null;
            this.f35399g = false;
        } finally {
            eg3Var.m5124b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX INFO: renamed from: e */
    public final SQLiteDatabase m13196e(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f35399g;
        Context context = this.f35393a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return z ? getWritableDatabase() : getReadableDatabase();
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                this = z ? getWritableDatabase() : getReadableDatabase();
                return this;
            } catch (Throwable th) {
                th = th;
                if (th instanceof wo1) {
                    wo1 wo1Var = (wo1) th;
                    int iOrdinal = wo1Var.f33545a.ordinal();
                    th = wo1Var.f33546b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        C0670g.m5864c();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f35396d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z ? this.getWritableDatabase() : this.getReadableDatabase();
                } catch (wo1 e) {
                    throw e.f33546b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.f35397e;
        hf0 hf0Var = this.f35395c;
        if (!z && hf0Var.f20528b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            m13195b(sQLiteDatabase);
            hf0Var.getClass();
        } catch (Throwable th) {
            throw new wo1(xo1.f34484a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f35395c.m6379m(m13195b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new wo1(xo1.f34485b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f35397e = true;
        try {
            this.f35395c.m6381o(m13195b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new wo1(xo1.f34487d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f35397e) {
            try {
                this.f35395c.m6380n(m13195b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new wo1(xo1.f34488e, th);
            }
        }
        this.f35399g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f35397e = true;
        try {
            this.f35395c.m6381o(m13195b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new wo1(xo1.f34486c, th);
        }
    }
}
