package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m66 extends q56 {

    /* JADX INFO: renamed from: i */
    public static final String[] f24694i = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: g */
    public wq5 f24695g;

    /* JADX INFO: renamed from: h */
    public boolean f24696h;

    /* JADX INFO: renamed from: A */
    public final SQLiteDatabase m8201A() {
        if (this.f24696h) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f24695g.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f24696h = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX INFO: renamed from: B */
    public final boolean m8202B(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM8201A;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        boolean z3 = false;
        z3 = false;
        if (!this.f24696h) {
            op5 op5Var = oa6Var.f26512d;
            d76 d76Var = oa6Var.f26514f;
            d56 d56Var = e56.f17777c1;
            Cursor cursor = null;
            cursor = null;
            cp6 cp6VarM4938y = op5Var.m9225E(null, d56Var) ? oa6Var.m9029p().m4938y(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (oa6Var.f26512d.m9225E(null, d56Var) && cp6VarM4938y != null) {
                contentValues.put("app_version", cp6VarM4938y.f16351f);
                contentValues.put("app_version_int", Long.valueOf(cp6VarM4938y.f16358m));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseM8201A = m8201A();
                    if (sQLiteDatabaseM8201A == null) {
                        this.f24696h = true;
                    } else {
                        try {
                            sQLiteDatabaseM8201A.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM8201A.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z = z3 ? 1 : 0;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM8201A != null) {
                                            sQLiteDatabaseM8201A.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z = z3 ? 1 : 0;
                                        oa6.m9016l(d76Var);
                                        d76Var.f16835j.m12505b(e, "Error writing entry; local database full");
                                        this.f24696h = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM8201A != null) {
                                            sQLiteDatabaseM8201A.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        z = z3 ? 1 : 0;
                                        z2 = true;
                                        if (sQLiteDatabaseM8201A != null) {
                                            sQLiteDatabaseM8201A.endTransaction();
                                        }
                                        oa6.m9016l(d76Var);
                                        d76Var.f16835j.m12505b(e, "Error writing entry to local database");
                                        this.f24696h = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM8201A != null) {
                                            sQLiteDatabaseM8201A.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseM8201A != null) {
                                        sQLiteDatabaseM8201A.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j >= 100000) {
                                oa6.m9016l(d76Var);
                                d76Var.f16835j.m12504a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseM8201A.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    oa6.m9016l(d76Var);
                                    x66 x66Var = d76Var.f16835j;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                x66Var.m12507d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                oa6.m9016l(d76Var);
                                                d76Var.f16835j.m12505b(e, "Error writing entry; local database full");
                                                this.f24696h = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM8201A != null) {
                                                    sQLiteDatabaseM8201A.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseM8201A != null) {
                                                    sQLiteDatabaseM8201A.endTransaction();
                                                }
                                                oa6.m9016l(d76Var);
                                                d76Var.f16835j.m12505b(e, "Error writing entry to local database");
                                                this.f24696h = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM8201A != null) {
                                                    sQLiteDatabaseM8201A.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteFullException e5) {
                                            e = e5;
                                            oa6.m9016l(d76Var);
                                            d76Var.f16835j.m12505b(e, "Error writing entry; local database full");
                                            this.f24696h = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM8201A != null) {
                                                sQLiteDatabaseM8201A.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            z2 = true;
                                            if (sQLiteDatabaseM8201A != null && sQLiteDatabaseM8201A.inTransaction()) {
                                                sQLiteDatabaseM8201A.endTransaction();
                                            }
                                            oa6.m9016l(d76Var);
                                            d76Var.f16835j.m12505b(e, "Error writing entry to local database");
                                            this.f24696h = z2;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM8201A != null) {
                                                sQLiteDatabaseM8201A.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM8201A != null) {
                                            sQLiteDatabaseM8201A.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseM8201A.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM8201A.setTransactionSuccessful();
                            sQLiteDatabaseM8201A.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM8201A.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM8201A = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM8201A = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseM8201A = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseM8201A = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12504a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // p000.q56
    /* JADX INFO: renamed from: x */
    public final boolean mo8203x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m8204y() {
        int iDelete;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        try {
            SQLiteDatabase sQLiteDatabaseM8201A = m8201A();
            if (sQLiteDatabaseM8201A == null || (iDelete = sQLiteDatabaseM8201A.delete("messages", null, null)) <= 0) {
                return;
            }
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[PHI: r5
  0x0070: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x0081, B:28:0x006e, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: z */
    public final boolean m8205z() {
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        if (!this.f24696h && oa6Var.f26509a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM8201A = m8201A();
                        if (sQLiteDatabaseM8201A != null) {
                            sQLiteDatabaseM8201A.beginTransaction();
                            sQLiteDatabaseM8201A.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseM8201A.setTransactionSuccessful();
                            sQLiteDatabaseM8201A.endTransaction();
                            sQLiteDatabaseM8201A.close();
                            return true;
                        }
                        this.f24696h = true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16835j.m12505b(e, "Error deleting app launch break from local database");
                        this.f24696h = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12505b(e2, "Error deleting app launch break from local database");
                    this.f24696h = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16838m.m12504a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }
}
