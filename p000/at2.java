package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class at2 {

    /* JADX INFO: renamed from: a */
    public final byte f14858a;

    /* JADX INFO: renamed from: b */
    public final byte f14859b;

    /* JADX WARN: Multi-variable type inference failed */
    public at2(int i, int i2) {
        this.f14858a = i;
        this.f14859b = i2;
    }

    /* JADX INFO: renamed from: a */
    public void mo3294a(uo1 uo1Var) {
        throw new t13("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    /* JADX INFO: renamed from: b */
    public void mo3295b(ve4 ve4Var) {
        if (!(ve4Var instanceof ve4)) {
            throw new t13("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        mo3294a(ve4Var.f32560a);
    }
}
