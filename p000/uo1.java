package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements Closeable {

    /* JADX INFO: renamed from: b */
    public static final String[] f32021b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c */
    public static final String[] f32022c = new String[0];

    /* JADX INFO: renamed from: d */
    public static final pg2 f32023d;

    /* JADX INFO: renamed from: e */
    public static final pg2 f32024e;

    /* JADX INFO: renamed from: a */
    public SQLiteDatabase f32025a;

    static {
        aj2 aj2Var = aj2.f14537b;
        f32023d = i25.m6630z(aj2Var, new fj0((byte) 17));
        f32024e = i25.m6630z(aj2Var, new fj0((byte) 18));
    }

    /* JADX INFO: renamed from: a */
    public final void m11589a() {
        this.f32025a.beginTransaction();
    }

    /* JADX INFO: renamed from: b */
    public final void m11590b() {
        this.f32025a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32025a.close();
    }

    /* JADX INFO: renamed from: e */
    public final bp1 m11591e(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f32025a.compileStatement(str);
        bp1 bp1Var = new bp1(sQLiteStatementCompileStatement);
        bp1Var.f15477b = sQLiteStatementCompileStatement;
        VarHandle.storeStoreFence();
        return bp1Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m11592g() {
        this.f32025a.endTransaction();
    }

    /* JADX INFO: renamed from: j */
    public final void m11593j(String str) {
        this.f32025a.execSQL(str);
    }

    /* JADX INFO: renamed from: k */
    public final void m11594k(Object[] objArr) {
        this.f32025a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11595l() {
        return this.f32025a.inTransaction();
    }

    /* JADX INFO: renamed from: q */
    public final void m11596q() {
        this.f32025a.setTransactionSuccessful();
    }
}
