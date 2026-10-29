package p000;

import ads_mobile_sdk.C0391wo;
import ads_mobile_sdk.y94;
import ads_mobile_sdk.za4;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aj5 implements gg0, ut5, vo4, b51, fu5, sm3 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ aj5 f14546b = new aj5(2);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ aj5 f14547c = new aj5(3);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ aj5 f14548d = new aj5(4);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ aj5 f14549e = new aj5(5);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ aj5 f14550f = new aj5(6);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ aj5 f14551g = new aj5(7);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ aj5 f14552h = new aj5(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ aj5 f14553i = new aj5(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ aj5 f14554j = new aj5(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ aj5 f14555k = new aj5(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ aj5 f14556l = new aj5(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ aj5 f14557m = new aj5(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ aj5 f14558n = new aj5(16);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ aj5 f14559o = new aj5(17);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ aj5 f14560p = new aj5(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ aj5 f14561q = new aj5(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ aj5 f14562r = new aj5(20);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ aj5 f14563s = new aj5(21);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ aj5 f14564t = new aj5(23);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ aj5 f14565u = new aj5(24);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ aj5 f14566v = new aj5(25);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ aj5 f14567w = new aj5(26);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14568a;

    public /* synthetic */ aj5(byte b) {
        this.f14568a = b;
    }

    /* JADX INFO: renamed from: c */
    public static za4 m3003c(long j) {
        return za4.m2884a((sf5) new y94(j));
    }

    /* JADX INFO: renamed from: d */
    public static void m3004d(long j, C0391wo c0391wo, boolean z) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = ((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        int iM13024d = y70.m13024d(1027101999, 1121861623, 2097482120, 23637094) ^ 75118620;
        long j8 = z ? (j + j) ^ (j >> 63) : j;
        int i = 1;
        while (true) {
            long j9 = j8 & j7;
            j8 >>>= 7;
            boolean z2 = j8 != 0 || i < 0;
            int i2 = (int) j9;
            if (z2) {
                i2 = ((i2 | 128) << iM13024d) >> iM13024d;
            }
            ((ByteArrayOutputStream) c0391wo.f13023a).write((byte) i2);
            if (!z2) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.b51
    /* JADX INFO: renamed from: a */
    public int mo3005a(Context context, String str, boolean z) {
        return e51.m4928d(context, str, z);
    }

    @Override // p000.sm3
    public void accept(Object obj, Object obj2) {
        m56 m56Var = (m56) ((vy5) obj).getService();
        nk6 nk6Var = new nk6((li4) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = mv5.f25247a;
        parcelObtain.writeInt(1);
        oh6.m9094S(parcelObtain, oh6.m9092Q(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(nk6Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            m56Var.f24675a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // p000.vo4
    public Object apply(Object obj) {
        return ((nf6) obj).m11237b();
    }

    @Override // p000.b51
    /* JADX INFO: renamed from: b */
    public int mo3006b(Context context, String str) {
        return e51.m4926a(context, str);
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object mo3007e(C0602e8 c0602e8) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c0602e8);
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: f */
    public Object mo3008f() {
        switch (this.f14568a) {
            case 3:
                return new Boolean(((Boolean) jn6.f22456a.m7959b()).booleanValue());
            case 4:
                List list = e56.f17769a;
                Boolean bool = (Boolean) mp6.f25121b.m7959b();
                bool.getClass();
                return bool;
            case 5:
                List list2 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19944o0.m7959b()).longValue());
            case 6:
                List list3 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19941n.m7959b();
            case 7:
                List list4 = e56.f17769a;
                zl6.f36172b.get();
                Long l = (Long) gm6.f19909U.m7959b();
                l.getClass();
                return l;
            case 8:
            case 15:
            case 22:
            default:
                return new Boolean(((Boolean) yn6.f35373a.m7959b()).booleanValue());
            case 9:
                List list5 = e56.f17769a;
                zl6.f36172b.get();
                Long l2 = (Long) gm6.f19897I.m7959b();
                l2.getClass();
                return l2;
            case 10:
                List list6 = e56.f17769a;
                zl6.f36172b.get();
                Long l3 = (Long) gm6.f19893E.m7959b();
                l3.getClass();
                return l3;
            case 11:
                List list7 = e56.f17769a;
                zl6.f36172b.get();
                Long l4 = (Long) gm6.f19894F.m7959b();
                l4.getClass();
                return l4;
            case 12:
                List list8 = e56.f17769a;
                zl6.f36172b.get();
                Long l5 = (Long) gm6.f19946p0.m7959b();
                l5.getClass();
                return l5;
            case 13:
                List list9 = e56.f17769a;
                zl6.f36172b.get();
                Long l6 = (Long) gm6.f19896H.m7959b();
                l6.getClass();
                return l6;
            case 14:
                List list10 = e56.f17769a;
                eo6.f18344b.get();
                Long l7 = (Long) go6.f19998b.m7959b();
                l7.getClass();
                return l7;
            case 16:
                List list11 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19934j0.m7959b()).longValue());
            case 17:
                List list12 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19916a0.m7959b();
            case 18:
                List list13 = e56.f17769a;
                zl6.f36172b.get();
                return (String) gm6.f19935k.m7959b();
            case 19:
                List list14 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19912X.m7959b()).longValue());
            case 20:
                List list15 = e56.f17769a;
                zl6.f36172b.get();
                return Integer.valueOf((int) ((Long) gm6.f19890B.m7959b()).longValue());
            case 21:
                List list16 = e56.f17769a;
                Boolean bool2 = (Boolean) co6.f16188a.m7959b();
                bool2.getClass();
                return bool2;
            case 23:
                List list17 = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool3 = (Boolean) ko6.f23302f.m7959b();
                bool3.getClass();
                return bool3;
            case 24:
                List list18 = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool4 = (Boolean) ko6.f23298b.m7959b();
                bool4.getClass();
                return bool4;
            case 25:
                List list19 = e56.f17769a;
                ho6.f20761b.get();
                Boolean bool5 = (Boolean) ko6.f23300d.m7959b();
                bool5.getClass();
                return bool5;
        }
    }

    @Override // p000.fu5
    /* JADX INFO: renamed from: g */
    public Object mo3009g(IBinder iBinder) {
        int i = sr5.f30529j;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHpoaService");
        return iInterfaceQueryLocalInterface instanceof ev5 ? (ev5) iInterfaceQueryLocalInterface : new vm5(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService", (byte) 4);
    }
}
