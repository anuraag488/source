package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ef4 extends gf4 {

    /* JADX INFO: renamed from: d */
    public int[] f18052d;

    /* JADX INFO: renamed from: e */
    public long[] f18053e;

    /* JADX INFO: renamed from: f */
    public double[] f18054f;

    /* JADX INFO: renamed from: g */
    public String[] f18055g;

    /* JADX INFO: renamed from: h */
    public byte[][] f18056h;

    /* JADX INFO: renamed from: i */
    public Cursor f18057i;

    /* JADX INFO: renamed from: q */
    public static void m5107q(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            zy5.m13857U(25, "column index out of range");
            throw null;
        }
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: E */
    public final void mo5108E(int i, byte[] bArr) {
        m6000j();
        m5113k(4, i);
        this.f18052d[i] = 4;
        this.f18056h[i] = bArr;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: a */
    public final void mo5109a(int i, String str) {
        m6000j();
        m5113k(3, i);
        this.f18052d[i] = 3;
        this.f18055g[i] = str;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: b */
    public final String mo5110b(int i) {
        m6000j();
        Cursor cursorM5116t = m5116t();
        m5107q(cursorM5116t, i);
        return cursorM5116t.getString(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f19771c) {
            m6000j();
            this.f18052d = new int[0];
            this.f18053e = new long[0];
            this.f18054f = new double[0];
            this.f18055g = new String[0];
            this.f18056h = new byte[0][];
            mo5111e();
        }
        this.f19771c = true;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: e */
    public final void mo5111e() {
        m6000j();
        Cursor cursor = this.f18057i;
        if (cursor != null) {
            cursor.close();
        }
        this.f18057i = null;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: g */
    public final boolean mo5112g() {
        m6000j();
        m5114l();
        Cursor cursor = this.f18057i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        C1077qn.m9989o("Required value was null.");
        return false;
    }

    @Override // p000.gf4
    public final byte[] getBlob(int i) {
        m6000j();
        Cursor cursorM5116t = m5116t();
        m5107q(cursorM5116t, i);
        return cursorM5116t.getBlob(i);
    }

    @Override // p000.gf4
    public final int getColumnCount() {
        m6000j();
        m5114l();
        Cursor cursor = this.f18057i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p000.gf4
    public final String getColumnName(int i) {
        m6000j();
        m5114l();
        Cursor cursor = this.f18057i;
        if (cursor != null) {
            m5107q(cursor, i);
            return cursor.getColumnName(i);
        }
        C1077qn.m9989o("Required value was null.");
        return null;
    }

    @Override // p000.gf4
    public final long getLong(int i) {
        m6000j();
        Cursor cursorM5116t = m5116t();
        m5107q(cursorM5116t, i);
        return cursorM5116t.getLong(i);
    }

    @Override // p000.gf4
    public final boolean isNull(int i) {
        m6000j();
        Cursor cursorM5116t = m5116t();
        m5107q(cursorM5116t, i);
        return cursorM5116t.isNull(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m5113k(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f18052d;
        if (iArr.length < i3) {
            this.f18052d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f18053e;
            if (jArr.length < i3) {
                this.f18053e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f18054f;
            if (dArr.length < i3) {
                this.f18054f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f18055g;
            if (strArr.length < i3) {
                this.f18055g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f18056h;
        if (bArr.length < i3) {
            this.f18056h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5114l() {
        if (this.f18057i == null) {
            wd3 wd3Var = new wd3((byte) 13);
            wd3Var.f33259b = this;
            VarHandle.storeStoreFence();
            uo1 uo1Var = this.f19769a;
            uo1Var.getClass();
            C0750i5 c0750i5 = new C0750i5((byte) 4);
            c0750i5.f21129b = wd3Var;
            VarHandle.storeStoreFence();
            SQLiteDatabase sQLiteDatabase = uo1Var.f32025a;
            to1 to1Var = new to1();
            to1Var.f31285a = c0750i5;
            VarHandle.storeStoreFence();
            this.f18057i = sQLiteDatabase.rawQueryWithFactory(to1Var, ((ef4) wd3Var.f33259b).f19770b, uo1.f32022c, null);
        }
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: m */
    public final void mo5115m(int i) {
        m6000j();
        m5113k(5, i);
        this.f18052d[i] = 5;
    }

    /* JADX INFO: renamed from: t */
    public final Cursor m5116t() {
        Cursor cursor = this.f18057i;
        if (cursor != null) {
            return cursor;
        }
        zy5.m13857U(21, "no row");
        throw null;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: z */
    public final void mo5117z(int i, long j) {
        m6000j();
        m5113k(1, i);
        this.f18052d[i] = 1;
        this.f18053e[i] = j;
    }
}
