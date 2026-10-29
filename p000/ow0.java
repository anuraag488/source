package p000;

import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27154a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27155b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27156c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f27157d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f27158e;

    public /* synthetic */ ow0(byte b) {
        this.f27154a = b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter = null;
        switch (this.f27154a) {
            case 0:
                qw0 qw0Var = (qw0) this.f27155b;
                C0588dv c0588dv = (C0588dv) this.f27156c;
                String str = c0588dv.f17420a;
                np4 np4Var = (np4) this.f27157d;
                C0467au c0467au = (C0467au) this.f27158e;
                qw0Var.getClass();
                Logger logger = qw0.f28841f;
                try {
                    jp4 jp4VarM11985a = qw0Var.f28844c.m11985a(str);
                    if (jp4VarM11985a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        np4Var.mo4671c(new IllegalArgumentException(str2));
                    } else {
                        C0467au c0467auM8213a = ((m70) jp4VarM11985a).m8213a(c0467au);
                        pt3 pt3Var = qw0Var.f28846e;
                        ck0 ck0Var = new ck0((byte) 2);
                        ck0Var.f16074b = qw0Var;
                        ck0Var.f16075c = c0588dv;
                        ck0Var.f16076d = c0467auM8213a;
                        VarHandle.storeStoreFence();
                        pt3Var.m9675k(ck0Var);
                        np4Var.mo4671c(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    np4Var.mo4671c(e);
                    return;
                }
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) this.f27155b;
                e25 e25Var = (e25) this.f27156c;
                List list = (List) this.f27157d;
                ik0 ik0Var = (ik0) this.f27158e;
                u25 u25VarMo3080w = workDatabase.mo3080w();
                String str3 = e25Var.f17648a;
                WorkDatabase workDatabase2 = u25VarMo3080w.f31629a;
                C1051py c1051py = new C1051py((byte) 16);
                c1051py.f28076b = str3;
                VarHandle.storeStoreFence();
                if (((Boolean) as4.m3231J(workDatabase2, true, false, c1051py)).booleanValue()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((bw3) it.next()).mo3746a(e25Var.f17648a);
                }
                ew3.m5411b(ik0Var, workDatabase, list);
                return;
            default:
                if1 if1Var = (if1) this.f27155b;
                String str4 = (String) this.f27156c;
                Map map = (Map) this.f27157d;
                List list2 = (List) this.f27158e;
                us2 us2Var = (us2) if1Var.f21325b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) if1Var.f21330g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str5 = (String) atomicMarkableReference.getReference();
                    File fileM6788c = us2Var.f32147a.m6788c(str4, "user-data");
                    try {
                        try {
                            ts2 ts2Var = new ts2();
                            ts2Var.put("userId", str5);
                            String string = ts2Var.toString();
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM6788c), us2.f32146b));
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                                se0.m10731l(bufferedWriter2, "Failed to close user metadata file.");
                            } catch (Exception e2) {
                                e = e2;
                                bufferedWriter = bufferedWriter2;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                se0.m10731l(bufferedWriter, "Failed to close user metadata file.");
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter = bufferedWriter2;
                                se0.m10731l(bufferedWriter, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    break;
                }
                if (!map.isEmpty()) {
                    us2Var.m11646h(str4, map, false);
                }
                if (list2.isEmpty()) {
                    return;
                }
                us2Var.m11647i(str4, list2);
                return;
        }
    }
}
