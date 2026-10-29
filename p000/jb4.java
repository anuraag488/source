package p000;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb4 {

    /* JADX INFO: renamed from: a */
    public static final boolean f22154a;

    /* JADX INFO: renamed from: b */
    public static final eb4.C0606a f22155b;

    /* JADX INFO: renamed from: c */
    public static final fb4.C0645a f22156c;

    /* JADX INFO: renamed from: d */
    public static final gb4 f22157d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f22154a = z;
        if (!z) {
            f22155b = null;
            f22156c = null;
            f22157d = null;
        } else {
            new ib4(Date.class, (byte) 0);
            new ib4(Timestamp.class, (byte) 1);
            f22155b = eb4.f17953b;
            f22156c = fb4.f18895b;
            f22157d = hb4.f20470b;
        }
    }
}
