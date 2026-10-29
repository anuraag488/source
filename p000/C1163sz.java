package p000;

import ads_mobile_sdk.C0434za;
import ads_mobile_sdk.bi3;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: sz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1163sz implements gg0, le4, xm0, n60, gx0, o64, nt3, cg4, w33 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30675a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30676b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30677c;

    public /* synthetic */ C1163sz(byte b) {
        this.f30675a = b;
    }

    /* JADX INFO: renamed from: a */
    public Object m10955a(yd2 yd2Var) {
        return ((wf3) this.f30676b).m12300a(yd2Var.m13097a(), ((yf3) this.f30677c).mo4514a());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0 A[LOOP:3: B:28:0x00ca->B:30:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[SYNTHETIC] */
    @Override // p000.nt3
    public Object apply(Object obj) {
        HashMap map;
        StringBuilder sb;
        ListIterator listIterator;
        C1010ou c1010ou;
        long j;
        C0940nb c0940nbM3310c;
        switch (this.f30675a) {
            case 13:
                pt3 pt3Var = (pt3) this.f30676b;
                String str = (String) this.f30677c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                pt3Var.getClass();
                sQLiteDatabase.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        pt3Var.m9674j(cursorRawQuery.getInt(0), ln2.f24202f, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            default:
                pt3 pt3Var2 = (pt3) this.f30676b;
                C0588dv c0588dv = (C0588dv) this.f30677c;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                C0504bu c0504bu = pt3Var2.f27975d;
                ArrayList arrayListM9673g = pt3Var2.m9673g(sQLiteDatabase2, c0588dv, c0504bu.f15599b);
                for (ag3 ag3Var : ag3.values()) {
                    if (ag3Var != c0588dv.f17422c) {
                        int size = c0504bu.f15599b - arrayListM9673g.size();
                        if (size <= 0) {
                            map = new HashMap();
                            sb = new StringBuilder("event_id IN (");
                            for (int i = 0; i < arrayListM9673g.size(); i++) {
                                sb.append(((C1010ou) arrayListM9673g.get(i)).f27100a);
                                if (i < arrayListM9673g.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            Cursor cursorQuery = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                            C1040pn c1040pn = new C1040pn((byte) 16);
                            c1040pn.f27754b = map;
                            VarHandle.storeStoreFence();
                            pt3.m9670q(cursorQuery, c1040pn);
                            listIterator = arrayListM9673g.listIterator();
                            while (listIterator.hasNext()) {
                                c1010ou = (C1010ou) listIterator.next();
                                j = c1010ou.f27100a;
                                if (!map.containsKey(Long.valueOf(j))) {
                                    c0940nbM3310c = c1010ou.f27102c.m3310c();
                                    for (ot3 ot3Var : (Set) map.get(Long.valueOf(j))) {
                                        c0940nbM3310c.m8667b(ot3Var.f27090a, ot3Var.f27091b);
                                    }
                                    listIterator.set(C1010ou.m9267a(j, c1010ou.f27101b, c0940nbM3310c.m8669e()));
                                }
                            }
                            return arrayListM9673g;
                        }
                        arrayListM9673g.addAll(pt3Var2.m9673g(sQLiteDatabase2, c0588dv.m4742b(ag3Var), size));
                    }
                }
                map = new HashMap();
                sb = new StringBuilder("event_id IN (");
                while (i < arrayListM9673g.size()) {
                    sb.append(((C1010ou) arrayListM9673g.get(i)).f27100a);
                    if (i < arrayListM9673g.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor cursorQuery2 = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                C1040pn c1040pn2 = new C1040pn((byte) 16);
                c1040pn2.f27754b = map;
                VarHandle.storeStoreFence();
                pt3.m9670q(cursorQuery2, c1040pn2);
                listIterator = arrayListM9673g.listIterator();
                while (listIterator.hasNext()) {
                    c1010ou = (C1010ou) listIterator.next();
                    j = c1010ou.f27100a;
                    if (!map.containsKey(Long.valueOf(j))) {
                        c0940nbM3310c = c1010ou.f27102c.m3310c();
                        while (r4.hasNext()) {
                            c0940nbM3310c.m8667b(ot3Var.f27090a, ot3Var.f27091b);
                        }
                        listIterator.set(C1010ou.m9267a(j, c1010ou.f27101b, c0940nbM3310c.m8669e()));
                    }
                }
                return arrayListM9673g;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10956b(f00 f00Var) {
        xn2 xn2Var = (xn2) this.f30676b;
        wp1 wp1Var = (wp1) this.f30677c;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on purchases updated " + f00Var.f18622a + " " + f00Var.f18624c + " " + f00Var.f18623b, null);
            }
        }
        wp1Var.invoke();
    }

    @Override // p000.gx0
    /* JADX INFO: renamed from: c */
    public void mo6188c(bi3 bi3Var) {
        gx0 gx0Var = (gx0) this.f30676b;
        gx0 gx0Var2 = (gx0) this.f30677c;
        gx0Var.mo6188c(bi3Var);
        gx0Var2.mo6188c(bi3Var);
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public Object mo4024d() {
        switch (this.f30675a) {
            case 15:
                wo5 wo5Var = (wo5) this.f30676b;
                Iterable iterable = (Iterable) this.f30677c;
                pt3 pt3Var = (pt3) wo5Var.f33568c;
                pt3Var.getClass();
                if (iterable.iterator().hasNext()) {
                    pt3Var.m9671a().compileStatement("DELETE FROM events WHERE _id in ".concat(pt3.m9669l(iterable))).execute();
                }
                break;
            default:
                wo5 wo5Var2 = (wo5) this.f30676b;
                for (Map.Entry entry : ((HashMap) this.f30677c).entrySet()) {
                    ((pt3) wo5Var2.f33574i).m9674j(((Integer) entry.getValue()).intValue(), ln2.f24203g, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        switch (this.f30675a) {
            case 1:
                String str = (String) this.f30676b;
                qf0 qf0Var = (qf0) this.f30677c;
                try {
                    Trace.beginSection(str);
                    return qf0Var.f28433f.mo3007e(c0602e8);
                } finally {
                    Trace.endSection();
                }
            default:
                String str2 = (String) this.f30676b;
                wb1 wb1Var = (wb1) this.f30677c;
                Context context = (Context) c0602e8.mo4017a(Context.class);
                String strValueOf = "";
                switch (wb1Var.f33212a) {
                    case 5:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 6:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 7:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.m4071a(installerPackageName);
                        }
                        break;
                }
                return C0811ju.m7283a(str2, strValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.content.res.AssetFileDescriptor] */
    @Override // p000.n60
    /* JADX INFO: renamed from: f */
    public Object mo4036f(m60 m60Var) {
        String str;
        String str2;
        int i = 0;
        switch (this.f30675a) {
            case 6:
                x72 x72Var = (x72) this.f30676b;
                AssetFileDescriptor assetFileDescriptorM13514K = (byte[]) this.f30677c;
                u72 u72Var = new u72(x72Var, m60Var);
                try {
                    try {
                        assetFileDescriptorM13514K = zc6.m13514K(assetFileDescriptorM13514K, ((i82) x72Var.f34037b).f21169c.f24731h);
                        try {
                            try {
                                ((oz1) ((qz1) x72Var.f34039d)).m9340G(assetFileDescriptorM13514K, u72Var);
                                synchronized (x72Var.f34038c) {
                                    try {
                                        ((Set) x72Var.f34040e).add(m60Var);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                    break;
                                }
                            } catch (DeadObjectException e) {
                                m60Var.m8199b(x72Var.m12523i(e).m11900a());
                            }
                            assetFileDescriptorM13514K.close();
                            return "evaluateJavascript Future";
                        } catch (RemoteException | RuntimeException e2) {
                            x72Var.m12523i(e2);
                            if (e2 instanceof RuntimeException) {
                                throw ((RuntimeException) e2);
                            }
                            throw new RuntimeException(e2);
                        }
                    } catch (Throwable th2) {
                        try {
                            assetFileDescriptorM13514K.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException e3) {
                    throw new UncheckedIOException(e3);
                }
            case 7:
                x72 x72Var2 = (x72) this.f30676b;
                try {
                    try {
                        ((oz1) ((qz1) x72Var2.f34039d)).m9339F((String) this.f30677c, new t72(x72Var2, m60Var));
                        synchronized (x72Var2.f34038c) {
                            try {
                                ((Set) x72Var2.f34040e).add(m60Var);
                            } catch (Throwable th4) {
                                throw th4;
                            }
                            break;
                        }
                        return "evaluateJavascript Future";
                    } catch (RemoteException | RuntimeException e4) {
                        x72Var2.m12523i(e4);
                        if (e4 instanceof RuntimeException) {
                            throw ((RuntimeException) e4);
                        }
                        throw new RuntimeException(e4);
                    }
                } catch (DeadObjectException e5) {
                    m60Var.m8199b(x72Var2.m12523i(e5).m11900a());
                    return "evaluateJavascript Future";
                }
            case 8:
                Context context = (Context) this.f30676b;
                Intent intent = (Intent) this.f30677c;
                l82 l82Var = new l82();
                l82Var.f23846c = context;
                l82Var.f23844a = m60Var;
                VarHandle.storeStoreFence();
                AtomicBoolean atomicBoolean = m82.f24723j;
                if (!atomicBoolean.compareAndSet(true, false)) {
                    m60Var.m8199b(new IllegalStateException("Binding to already bound service"));
                    return "JavaScriptSandbox Future";
                }
                try {
                    if (context.bindService(intent, l82Var, -2147483647)) {
                        Executor mainExecutor = context.getMainExecutor();
                        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 14);
                        runnableC1285w9.f33164b = context;
                        runnableC1285w9.f33165c = l82Var;
                        VarHandle.storeStoreFence();
                        no3 no3Var = m60Var.f24680c;
                        if (no3Var != null) {
                            no3Var.mo6454a(runnableC1285w9, mainExecutor);
                        }
                    } else {
                        context.unbindService(l82Var);
                        atomicBoolean.set(true);
                        m60Var.m8199b(new RuntimeException("bindService() returned false " + intent));
                    }
                    return "JavaScriptSandbox Future";
                } catch (SecurityException e6) {
                    context.unbindService(l82Var);
                    atomicBoolean.set(true);
                    m60Var.m8199b(e6);
                    return "JavaScriptSandbox Future";
                }
            case 17:
                Executor executor = (Executor) this.f30676b;
                sj4 sj4Var = (sj4) this.f30677c;
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 18);
                runnableC1054q0.f28115b = atomicBoolean2;
                VarHandle.storeStoreFence();
                tz0 tz0Var = tz0.f31554a;
                no3 no3Var2 = m60Var.f24680c;
                if (no3Var2 != null) {
                    no3Var2.mo6454a(runnableC1054q0, tz0Var);
                }
                RunnableC0612eh runnableC0612eh = new RunnableC0612eh((byte) 6);
                runnableC0612eh.f18081b = atomicBoolean2;
                runnableC0612eh.f18082c = m60Var;
                runnableC0612eh.f18083d = sj4Var;
                VarHandle.storeStoreFence();
                executor.execute(runnableC0612eh);
                return ju4.f22634a;
            default:
                Context context2 = (Context) this.f30676b;
                C0434za c0434za = (C0434za) this.f30677c;
                try {
                    String packageName = context2.getPackageName();
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    String[] strArr = {c0434za.m2855R(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
                    int i2 = 0;
                    while (true) {
                        if (i2 < 2) {
                            str = strArr[i2];
                            if (TextUtils.isEmpty(str)) {
                                i2++;
                            }
                        } else {
                            str = "";
                        }
                    }
                    byte[] bArrM10149a = C1087qx.f28858f.m10152f().m10149a(str);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM10149a)));
                    if (!Build.TYPE.equals("user")) {
                        String[] strArr2 = {c0434za.m2840B(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                        while (true) {
                            if (i < 2) {
                                str2 = strArr2[i];
                                if (TextUtils.isEmpty(str2)) {
                                    i++;
                                }
                            } else {
                                str2 = "";
                            }
                        }
                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(C1087qx.f28858f.m10152f().m10149a(str2))));
                    }
                    PackageManager packageManager = context2.getPackageManager();
                    yf5 yf5Var = new yf5();
                    yf5Var.f35198a = m60Var;
                    VarHandle.storeStoreFence();
                    packageManager.requestChecksums(packageName, false, 8, arrayList, yf5Var);
                    break;
                } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
                    m60Var.m8198a("");
                }
                return "";
        }
    }

    @Override // p000.o64
    /* JADX INFO: renamed from: g */
    public boolean mo8969g() {
        ie3 ie3Var = (ie3) this.f30676b;
        C0775iv c0775iv = (C0775iv) this.f30677c;
        boolean z = ie3Var.f21303q;
        if (z) {
            return z;
        }
        ie3Var.m6781i();
        long jM6941a = C0775iv.m6941a(ie3Var.f21301o, c0775iv.f21812a);
        c0775iv.f21812a = jM6941a;
        boolean z2 = !ie3Var.m6780h(ie3Var.f21300n, jM6941a + c0775iv.f21813b);
        ie3Var.f21303q = z2;
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #10 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d0, B:64:0x00d4, B:66:0x00d7, B:70:0x00db, B:71:0x00dc, B:65:0x00d5), top: B:167:0x001b, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #10 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d0, B:64:0x00d4, B:66:0x00d7, B:70:0x00db, B:71:0x00dc, B:65:0x00d5), top: B:167:0x001b, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [ek0] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [nr6] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v50, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) throws Throwable {
        InputStream errorStream;
        ?? r10;
        ?? ValueOf;
        boolean z = true;
        switch (this.f30675a) {
            case 3:
                return ((wo5) this.f30676b).m12347b(nr6Var, 0L, (HashMap) this.f30677c);
            case 4:
                wo5 wo5Var = (wo5) this.f30676b;
                Date date = (Date) this.f30677c;
                if (nr6Var.m8826j()) {
                    gk0 gk0Var = (gk0) wo5Var.f33573h;
                    synchronized (gk0Var.f19825b) {
                        gk0Var.f19824a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception excM8823g = nr6Var.m8823g();
                    if (excM8823g != null) {
                        boolean z2 = excM8823g instanceof zg1;
                        gk0 gk0Var2 = (gk0) wo5Var.f33573h;
                        if (!z2) {
                            synchronized (gk0Var2.f19825b) {
                                gk0Var2.f19824a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        } else {
                            synchronized (gk0Var2.f19825b) {
                                gk0Var2.f19824a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        }
                    }
                    break;
                }
                return nr6Var;
            default:
                ?? r0 = (ek0) this.f30676b;
                ?? inputStream = (nr6) this.f30677c;
                ia5 ia5Var = r0.f18166p;
                ?? r7 = 0;
                try {
                    try {
                        if (!inputStream.m8826j()) {
                            throw new IOException(inputStream.m8823g());
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.m8824h();
                        r0.f18156f = httpURLConnection;
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            errorStream = r0.f18156f.getErrorStream();
                            try {
                                int responseCode = r0.f18156f.getResponseCode();
                                ValueOf = Integer.valueOf(responseCode);
                                if (responseCode == 200) {
                                    try {
                                        synchronized (r0) {
                                            r0.f18153c = 8;
                                        }
                                        r0.f18167q.m6014e(0, gk0.f19823f);
                                        rj0 rj0VarM5147j = r0.m5147j(r0.f18156f);
                                        r0.f18157g = rj0VarM5147j;
                                        rj0VarM5147j.m10341c();
                                    } catch (IOException e) {
                                        e = e;
                                        if (r0.f18155e) {
                                            synchronized (r0) {
                                                r0.f18153c = 8;
                                            }
                                        } else {
                                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                        }
                                        r0.m5141b(inputStream, errorStream);
                                        synchronized (r0) {
                                            r0.f18152b = false;
                                        }
                                        if (r0.f18155e || (ValueOf != 0 && !ek0.m5138d(ValueOf.intValue()))) {
                                            z = false;
                                        }
                                        if (z) {
                                            ia5Var.getClass();
                                            r0.m5148k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!z || ValueOf.intValue() == 200) {
                                            r0.m5145h();
                                        } else {
                                            String strM5139f = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (ValueOf.intValue() == 403) {
                                                strM5139f = ek0.m5139f(r0.f18156f.getErrorStream());
                                            }
                                            new bh1(ValueOf.intValue(), strM5139f);
                                        }
                                        r0.f18156f = null;
                                        r0.f18157g = null;
                                        return y62.m12936B(null);
                                    }
                                }
                                r0.m5141b(inputStream, errorStream);
                                synchronized (r0) {
                                    r0.f18152b = false;
                                }
                                z = !r0.f18155e && ek0.m5138d(responseCode);
                                if (z) {
                                    ia5Var.getClass();
                                    r0.m5148k(new Date(System.currentTimeMillis()));
                                }
                                if (z || responseCode == 200) {
                                    r0.m5145h();
                                } else {
                                    String strM5139f2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (responseCode == 403) {
                                        strM5139f2 = ek0.m5139f(r0.f18156f.getErrorStream());
                                    }
                                    new bh1(responseCode, strM5139f2);
                                    r0.m5144g();
                                }
                            } catch (IOException e2) {
                                e = e2;
                                ValueOf = 0;
                            } catch (Throwable th) {
                                th = th;
                                ValueOf = 0;
                                r7 = inputStream;
                                r10 = ValueOf;
                                r0.m5141b(r7, errorStream);
                                synchronized (r0) {
                                    r0.f18152b = false;
                                    if (r0.f18155e || (r10 != 0 && !ek0.m5138d(r10.intValue()))) {
                                        z = false;
                                    }
                                    if (z) {
                                        ia5Var.getClass();
                                        r0.m5148k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z || r10.intValue() == 200) {
                                        r0.m5145h();
                                    } else {
                                        String strM5139f3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                                        if (r10.intValue() == 403) {
                                            strM5139f3 = ek0.m5139f(r0.f18156f.getErrorStream());
                                        }
                                        new bh1(r10.intValue(), strM5139f3);
                                        r0.m5144g();
                                    }
                                    throw th;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            errorStream = null;
                            inputStream = inputStream;
                            ValueOf = errorStream;
                            if (r0.f18155e) {
                                synchronized (r0) {
                                    r0.f18153c = 8;
                                }
                            } else {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            }
                            r0.m5141b(inputStream, errorStream);
                            synchronized (r0) {
                                r0.f18152b = false;
                                if (r0.f18155e) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    ia5Var.getClass();
                                    r0.m5148k(new Date(System.currentTimeMillis()));
                                }
                                if (z) {
                                }
                                r0.m5145h();
                                r0.f18156f = null;
                                r0.f18157g = null;
                                return y62.m12936B(null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            errorStream = null;
                            ValueOf = 0;
                        }
                        r0.f18156f = null;
                        r0.f18157g = null;
                        return y62.m12936B(null);
                    } catch (IOException e4) {
                        e = e4;
                        inputStream = 0;
                        errorStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        errorStream = null;
                        r10 = 0;
                        r0.m5141b(r7, errorStream);
                        synchronized (r0) {
                            r0.f18152b = false;
                            if (r0.f18155e) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                ia5Var.getClass();
                                r0.m5148k(new Date(System.currentTimeMillis()));
                            }
                            if (z) {
                                r0.m5145h();
                            } else {
                                r0.m5145h();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
        }
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        uj0 uj0Var = (uj0) this.f30676b;
        wj0 wj0Var = (wj0) this.f30677c;
        synchronized (uj0Var) {
            uj0Var.f31905c = y62.m12936B(wj0Var);
        }
        return y62.m12936B(wj0Var);
    }

    @Override // p000.w33
    public void onComplete(nr6 nr6Var) {
        bi3 bi3Var = (bi3) this.f30676b;
        li4 li4Var = (li4) this.f30677c;
        synchronized (bi3Var.f1183f) {
            bi3Var.f1182e.remove(li4Var);
        }
    }
}
