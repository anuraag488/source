package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22257a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f22258b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f22259c;

    public /* synthetic */ jg4(byte b) {
        this.f22257a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        ig4 ig4Var;
        byte b = this.f22257a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                String str = this.f22258b;
                int i = this.f22259c;
                gf4 gf4VarM11888b = ((ve4) obj).m11888b("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    gf4VarM11888b.mo5109a(1, str);
                    gf4VarM11888b.mo5117z(2, i);
                    int iM10633E = sc6.m10633E(gf4VarM11888b, "work_spec_id");
                    int iM10633E2 = sc6.m10633E(gf4VarM11888b, "generation");
                    int iM10633E3 = sc6.m10633E(gf4VarM11888b, "system_id");
                    if (gf4VarM11888b.mo5112g()) {
                        ig4Var = new ig4((int) gf4VarM11888b.getLong(iM10633E2), gf4VarM11888b.mo5110b(iM10633E), (int) gf4VarM11888b.getLong(iM10633E3));
                        break;
                    } else {
                        ig4Var = null;
                    }
                    return ig4Var;
                } finally {
                    gf4VarM11888b.close();
                }
            case 1:
                String str2 = this.f22258b;
                int i2 = this.f22259c;
                gf4 gf4VarM11888b2 = ((ve4) obj).m11888b("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    gf4VarM11888b2.mo5109a(1, str2);
                    gf4VarM11888b2.mo5117z(2, i2);
                    gf4VarM11888b2.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b2.close();
                }
            default:
                int i3 = this.f22259c;
                String str3 = this.f22258b;
                gf4 gf4VarM11888b3 = ((ve4) obj).m11888b("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    gf4VarM11888b3.mo5117z(1, i3);
                    gf4VarM11888b3.mo5109a(2, str3);
                    gf4VarM11888b3.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b3.close();
                }
        }
    }
}
