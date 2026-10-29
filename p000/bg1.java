package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bg1 {

    /* JADX INFO: renamed from: a */
    public bi3 f15253a;

    /* JADX INFO: renamed from: b */
    public String f15254b;

    /* JADX INFO: renamed from: c */
    public Integer f15255c;

    /* JADX INFO: renamed from: a */
    public static boolean m3569a(ArrayList arrayList, C1316x2 c1316x2) {
        String str = c1316x2.f33934a;
        String str2 = c1316x2.f33935b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1316x2 c1316x3 = (C1316x2) obj;
            if (c1316x3.f33934a.equals(str) && c1316x3.f33935b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m3570b() {
        InterfaceC0828ka interfaceC0828ka = (InterfaceC0828ka) this.f15253a.get();
        String str = this.f15254b;
        C0865la c0865la = (C0865la) interfaceC0828ka;
        c0865la.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : c0865la.f23885a.getConditionalUserProperties(str, "")) {
            x12 x12Var = fv5.f19342a;
            y42.m12854a0(bundle);
            C0791ja c0791ja = new C0791ja();
            String str2 = (String) qu5.m10127c(bundle, "origin", String.class, null);
            y42.m12854a0(str2);
            c0791ja.f22115a = str2;
            String str3 = (String) qu5.m10127c(bundle, "name", String.class, null);
            y42.m12854a0(str3);
            c0791ja.f22116b = str3;
            c0791ja.f22117c = qu5.m10127c(bundle, "value", Object.class, null);
            c0791ja.f22118d = (String) qu5.m10127c(bundle, "trigger_event_name", String.class, null);
            c0791ja.f22119e = ((Long) qu5.m10127c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c0791ja.f22120f = (String) qu5.m10127c(bundle, "timed_out_event_name", String.class, null);
            c0791ja.f22121g = (Bundle) qu5.m10127c(bundle, "timed_out_event_params", Bundle.class, null);
            c0791ja.f22122h = (String) qu5.m10127c(bundle, "triggered_event_name", String.class, null);
            c0791ja.f22123i = (Bundle) qu5.m10127c(bundle, "triggered_event_params", Bundle.class, null);
            c0791ja.f22124j = ((Long) qu5.m10127c(bundle, "time_to_live", Long.class, 0L)).longValue();
            c0791ja.f22125k = (String) qu5.m10127c(bundle, "expired_event_name", String.class, null);
            c0791ja.f22126l = (Bundle) qu5.m10127c(bundle, "expired_event_params", Bundle.class, null);
            c0791ja.f22128n = ((Boolean) qu5.m10127c(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            c0791ja.f22127m = ((Long) qu5.m10127c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c0791ja.f22129o = ((Long) qu5.m10127c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c0791ja);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x02be  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:138:0x0307  */
    /* JADX WARN: Code duplicated, block: B:141:0x0310  */
    /* JADX WARN: Code duplicated, block: B:144:0x0319  */
    /* JADX WARN: Code duplicated, block: B:147:0x0320  */
    /* JADX WARN: Code duplicated, block: B:150:0x0330  */
    /* JADX WARN: Code duplicated, block: B:153:0x0339  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /* JADX WARN: Code duplicated, block: B:159:0x034b  */
    /* JADX WARN: Code duplicated, block: B:162:0x035b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0364  */
    /* JADX WARN: Code duplicated, block: B:209:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:94:0x025d  */
    /* JADX INFO: renamed from: c */
    public final void m3571c(ArrayList arrayList) throws C1278w2 {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle;
        String str5;
        String str6;
        Object obj;
        String str7;
        String str8;
        Bundle bundle2;
        String str9;
        Bundle bundle3;
        String str10;
        Bundle bundle4;
        bi3 bi3Var = this.f15253a;
        if (bi3Var.get() == null) {
            throw new C1278w2("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            String str11 = "";
            if (i >= size) {
                String str12 = this.f15254b;
                if (arrayList2.isEmpty()) {
                    if (bi3Var.get() == null) {
                        throw new C1278w2("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    ArrayList arrayListM3570b = m3570b();
                    int size2 = arrayListM3570b.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListM3570b.get(i2);
                        i2++;
                        ((C0865la) ((InterfaceC0828ka) bi3Var.get())).f23885a.clearConditionalUserProperty(((C0791ja) obj2).f22116b, null, null);
                    }
                    return;
                }
                if (bi3Var.get() == null) {
                    throw new C1278w2("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList arrayListM3570b2 = m3570b();
                ArrayList arrayList3 = new ArrayList();
                int size3 = arrayListM3570b2.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayListM3570b2.get(i3);
                    i3++;
                    C0791ja c0791ja = (C0791ja) obj3;
                    String[] strArr = C1316x2.f33932g;
                    String str13 = c0791ja.f22118d;
                    arrayList3.add(new C1316x2(c0791ja.f22116b, String.valueOf(c0791ja.f22117c), str13 != null ? str13 : str11, new Date(c0791ja.f22127m), c0791ja.f22119e, c0791ja.f22124j));
                    size3 = size3;
                    str11 = str11;
                }
                ArrayList arrayList4 = new ArrayList();
                int size4 = arrayList3.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj4 = arrayList3.get(i4);
                    i4++;
                    C1316x2 c1316x2 = (C1316x2) obj4;
                    if (!m3569a(arrayList2, c1316x2)) {
                        arrayList4.add(c1316x2.m12462a(str12));
                    }
                }
                int size5 = arrayList4.size();
                int i5 = 0;
                while (i5 < size5) {
                    Object obj5 = arrayList4.get(i5);
                    i5++;
                    ((C0865la) ((InterfaceC0828ka) bi3Var.get())).f23885a.clearConditionalUserProperty(((C0791ja) obj5).f22116b, null, null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size6 = arrayList2.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList2.get(i6);
                    i6++;
                    C1316x2 c1316x3 = (C1316x2) obj6;
                    if (!m3569a(arrayList3, c1316x3)) {
                        arrayList5.add(c1316x3);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(m3570b());
                Integer numValueOf = this.f15255c;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(((C0865la) ((InterfaceC0828ka) bi3Var.get())).f23885a.getMaxUserProperties(str12));
                    this.f15255c = numValueOf;
                }
                int iIntValue = numValueOf.intValue();
                int size7 = arrayList5.size();
                int i7 = 0;
                while (i7 < size7) {
                    int i8 = i7 + 1;
                    C1316x2 c1316x4 = (C1316x2) arrayList5.get(i7);
                    while (arrayDeque.size() >= iIntValue) {
                        ((C0865la) ((InterfaceC0828ka) bi3Var.get())).f23885a.clearConditionalUserProperty(((C0791ja) arrayDeque.pollFirst()).f22116b, null, null);
                    }
                    C0791ja c0791jaM12462a = c1316x4.m12462a(str12);
                    C0865la c0865la = (C0865la) ((InterfaceC0828ka) bi3Var.get());
                    c0865la.getClass();
                    x12 x12Var = fv5.f19342a;
                    String str14 = c0791jaM12462a.f22115a;
                    if (str14 != null && !str14.isEmpty()) {
                        Object obj7 = c0791jaM12462a.f22117c;
                        if (obj7 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj7);
                                    objectOutputStream.flush();
                                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object object = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            object = null;
                                        }
                                        if (object != null) {
                                            if (!fv5.f19344c.contains(str14)) {
                                                str = c0791jaM12462a.f22116b;
                                                if (!"_ce1".equals(str) || "_ce2".equals(str)) {
                                                    if (str14.equals("fcm") || str14.equals("frc")) {
                                                        str2 = c0791jaM12462a.f22125k;
                                                        if ((str2 != null || (fv5.m5821a(str2, c0791jaM12462a.f22126l) && fv5.m5822b(str14, c0791jaM12462a.f22125k, c0791jaM12462a.f22126l))) && (((str3 = c0791jaM12462a.f22122h) == null || (fv5.m5821a(str3, c0791jaM12462a.f22123i) && fv5.m5822b(str14, c0791jaM12462a.f22122h, c0791jaM12462a.f22123i))) && ((str4 = c0791jaM12462a.f22120f) == null || (fv5.m5821a(str4, c0791jaM12462a.f22121g) && fv5.m5822b(str14, c0791jaM12462a.f22120f, c0791jaM12462a.f22121g))))) {
                                                            AppMeasurementSdk appMeasurementSdk = c0865la.f23885a;
                                                            bundle = new Bundle();
                                                            str5 = c0791jaM12462a.f22115a;
                                                            if (str5 != null) {
                                                                bundle.putString("origin", str5);
                                                            }
                                                            str6 = c0791jaM12462a.f22116b;
                                                            if (str6 != null) {
                                                                bundle.putString("name", str6);
                                                            }
                                                            obj = c0791jaM12462a.f22117c;
                                                            if (obj != null) {
                                                                qu5.m10126b(bundle, obj);
                                                            }
                                                            str7 = c0791jaM12462a.f22118d;
                                                            if (str7 != null) {
                                                                bundle.putString("trigger_event_name", str7);
                                                            }
                                                            bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                                            str8 = c0791jaM12462a.f22120f;
                                                            if (str8 != null) {
                                                                bundle.putString("timed_out_event_name", str8);
                                                            }
                                                            bundle2 = c0791jaM12462a.f22121g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str9 = c0791jaM12462a.f22122h;
                                                            if (str9 != null) {
                                                                bundle.putString("triggered_event_name", str9);
                                                            }
                                                            bundle3 = c0791jaM12462a.f22123i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                                            str10 = c0791jaM12462a.f22125k;
                                                            if (str10 != null) {
                                                                bundle.putString("expired_event_name", str10);
                                                            }
                                                            bundle4 = c0791jaM12462a.f22126l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                                            bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                                            bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                                            appMeasurementSdk.setConditionalUserProperty(bundle);
                                                        }
                                                    }
                                                } else if ("_ln".equals(str)) {
                                                    if (str14.equals("fcm") || str14.equals("fiam")) {
                                                        str2 = c0791jaM12462a.f22125k;
                                                        if (str2 != null) {
                                                            AppMeasurementSdk appMeasurementSdk2 = c0865la.f23885a;
                                                            bundle = new Bundle();
                                                            str5 = c0791jaM12462a.f22115a;
                                                            if (str5 != null) {
                                                                bundle.putString("origin", str5);
                                                            }
                                                            str6 = c0791jaM12462a.f22116b;
                                                            if (str6 != null) {
                                                                bundle.putString("name", str6);
                                                            }
                                                            obj = c0791jaM12462a.f22117c;
                                                            if (obj != null) {
                                                                qu5.m10126b(bundle, obj);
                                                            }
                                                            str7 = c0791jaM12462a.f22118d;
                                                            if (str7 != null) {
                                                                bundle.putString("trigger_event_name", str7);
                                                            }
                                                            bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                                            str8 = c0791jaM12462a.f22120f;
                                                            if (str8 != null) {
                                                                bundle.putString("timed_out_event_name", str8);
                                                            }
                                                            bundle2 = c0791jaM12462a.f22121g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str9 = c0791jaM12462a.f22122h;
                                                            if (str9 != null) {
                                                                bundle.putString("triggered_event_name", str9);
                                                            }
                                                            bundle3 = c0791jaM12462a.f22123i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                                            str10 = c0791jaM12462a.f22125k;
                                                            if (str10 != null) {
                                                                bundle.putString("expired_event_name", str10);
                                                            }
                                                            bundle4 = c0791jaM12462a.f22126l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                                            bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                                            bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                                            appMeasurementSdk2.setConditionalUserProperty(bundle);
                                                        } else {
                                                            AppMeasurementSdk appMeasurementSdk3 = c0865la.f23885a;
                                                            bundle = new Bundle();
                                                            str5 = c0791jaM12462a.f22115a;
                                                            if (str5 != null) {
                                                                bundle.putString("origin", str5);
                                                            }
                                                            str6 = c0791jaM12462a.f22116b;
                                                            if (str6 != null) {
                                                                bundle.putString("name", str6);
                                                            }
                                                            obj = c0791jaM12462a.f22117c;
                                                            if (obj != null) {
                                                                qu5.m10126b(bundle, obj);
                                                            }
                                                            str7 = c0791jaM12462a.f22118d;
                                                            if (str7 != null) {
                                                                bundle.putString("trigger_event_name", str7);
                                                            }
                                                            bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                                            str8 = c0791jaM12462a.f22120f;
                                                            if (str8 != null) {
                                                                bundle.putString("timed_out_event_name", str8);
                                                            }
                                                            bundle2 = c0791jaM12462a.f22121g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str9 = c0791jaM12462a.f22122h;
                                                            if (str9 != null) {
                                                                bundle.putString("triggered_event_name", str9);
                                                            }
                                                            bundle3 = c0791jaM12462a.f22123i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                                            str10 = c0791jaM12462a.f22125k;
                                                            if (str10 != null) {
                                                                bundle.putString("expired_event_name", str10);
                                                            }
                                                            bundle4 = c0791jaM12462a.f22126l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                                            bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                                            bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                                            appMeasurementSdk3.setConditionalUserProperty(bundle);
                                                        }
                                                    }
                                                } else if (!fv5.f19346e.contains(str)) {
                                                    em3 em3Var = fv5.f19347f;
                                                    int i9 = em3Var.f18261d;
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 < i9) {
                                                            boolean zMatches = str.matches((String) em3Var.get(i10));
                                                            i10++;
                                                            if (zMatches) {
                                                            }
                                                        } else {
                                                            str2 = c0791jaM12462a.f22125k;
                                                            if (str2 != null) {
                                                                AppMeasurementSdk appMeasurementSdk4 = c0865la.f23885a;
                                                                bundle = new Bundle();
                                                                str5 = c0791jaM12462a.f22115a;
                                                                if (str5 != null) {
                                                                    bundle.putString("origin", str5);
                                                                }
                                                                str6 = c0791jaM12462a.f22116b;
                                                                if (str6 != null) {
                                                                    bundle.putString("name", str6);
                                                                }
                                                                obj = c0791jaM12462a.f22117c;
                                                                if (obj != null) {
                                                                    qu5.m10126b(bundle, obj);
                                                                }
                                                                str7 = c0791jaM12462a.f22118d;
                                                                if (str7 != null) {
                                                                    bundle.putString("trigger_event_name", str7);
                                                                }
                                                                bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                                                str8 = c0791jaM12462a.f22120f;
                                                                if (str8 != null) {
                                                                    bundle.putString("timed_out_event_name", str8);
                                                                }
                                                                bundle2 = c0791jaM12462a.f22121g;
                                                                if (bundle2 != null) {
                                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                                }
                                                                str9 = c0791jaM12462a.f22122h;
                                                                if (str9 != null) {
                                                                    bundle.putString("triggered_event_name", str9);
                                                                }
                                                                bundle3 = c0791jaM12462a.f22123i;
                                                                if (bundle3 != null) {
                                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                                }
                                                                bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                                                str10 = c0791jaM12462a.f22125k;
                                                                if (str10 != null) {
                                                                    bundle.putString("expired_event_name", str10);
                                                                }
                                                                bundle4 = c0791jaM12462a.f22126l;
                                                                if (bundle4 != null) {
                                                                    bundle.putBundle("expired_event_params", bundle4);
                                                                }
                                                                bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                                                bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                                                bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                                                appMeasurementSdk4.setConditionalUserProperty(bundle);
                                                            } else {
                                                                AppMeasurementSdk appMeasurementSdk5 = c0865la.f23885a;
                                                                bundle = new Bundle();
                                                                str5 = c0791jaM12462a.f22115a;
                                                                if (str5 != null) {
                                                                    bundle.putString("origin", str5);
                                                                }
                                                                str6 = c0791jaM12462a.f22116b;
                                                                if (str6 != null) {
                                                                    bundle.putString("name", str6);
                                                                }
                                                                obj = c0791jaM12462a.f22117c;
                                                                if (obj != null) {
                                                                    qu5.m10126b(bundle, obj);
                                                                }
                                                                str7 = c0791jaM12462a.f22118d;
                                                                if (str7 != null) {
                                                                    bundle.putString("trigger_event_name", str7);
                                                                }
                                                                bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                                                str8 = c0791jaM12462a.f22120f;
                                                                if (str8 != null) {
                                                                    bundle.putString("timed_out_event_name", str8);
                                                                }
                                                                bundle2 = c0791jaM12462a.f22121g;
                                                                if (bundle2 != null) {
                                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                                }
                                                                str9 = c0791jaM12462a.f22122h;
                                                                if (str9 != null) {
                                                                    bundle.putString("triggered_event_name", str9);
                                                                }
                                                                bundle3 = c0791jaM12462a.f22123i;
                                                                if (bundle3 != null) {
                                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                                }
                                                                bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                                                str10 = c0791jaM12462a.f22125k;
                                                                if (str10 != null) {
                                                                    bundle.putString("expired_event_name", str10);
                                                                }
                                                                bundle4 = c0791jaM12462a.f22126l;
                                                                if (bundle4 != null) {
                                                                    bundle.putBundle("expired_event_params", bundle4);
                                                                }
                                                                bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                                                bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                                                bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                                                appMeasurementSdk5.setConditionalUserProperty(bundle);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectInputStream = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream = null;
                                objectInputStream = null;
                            }
                        } else if (!fv5.f19344c.contains(str14)) {
                            str = c0791jaM12462a.f22116b;
                            if ("_ce1".equals(str)) {
                                if (str14.equals("fcm")) {
                                    str2 = c0791jaM12462a.f22125k;
                                    if (str2 != null) {
                                        AppMeasurementSdk appMeasurementSdk6 = c0865la.f23885a;
                                        bundle = new Bundle();
                                        str5 = c0791jaM12462a.f22115a;
                                        if (str5 != null) {
                                            bundle.putString("origin", str5);
                                        }
                                        str6 = c0791jaM12462a.f22116b;
                                        if (str6 != null) {
                                            bundle.putString("name", str6);
                                        }
                                        obj = c0791jaM12462a.f22117c;
                                        if (obj != null) {
                                            qu5.m10126b(bundle, obj);
                                        }
                                        str7 = c0791jaM12462a.f22118d;
                                        if (str7 != null) {
                                            bundle.putString("trigger_event_name", str7);
                                        }
                                        bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                        str8 = c0791jaM12462a.f22120f;
                                        if (str8 != null) {
                                            bundle.putString("timed_out_event_name", str8);
                                        }
                                        bundle2 = c0791jaM12462a.f22121g;
                                        if (bundle2 != null) {
                                            bundle.putBundle("timed_out_event_params", bundle2);
                                        }
                                        str9 = c0791jaM12462a.f22122h;
                                        if (str9 != null) {
                                            bundle.putString("triggered_event_name", str9);
                                        }
                                        bundle3 = c0791jaM12462a.f22123i;
                                        if (bundle3 != null) {
                                            bundle.putBundle("triggered_event_params", bundle3);
                                        }
                                        bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                        str10 = c0791jaM12462a.f22125k;
                                        if (str10 != null) {
                                            bundle.putString("expired_event_name", str10);
                                        }
                                        bundle4 = c0791jaM12462a.f22126l;
                                        if (bundle4 != null) {
                                            bundle.putBundle("expired_event_params", bundle4);
                                        }
                                        bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                        bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                        bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                        appMeasurementSdk6.setConditionalUserProperty(bundle);
                                    } else {
                                        AppMeasurementSdk appMeasurementSdk7 = c0865la.f23885a;
                                        bundle = new Bundle();
                                        str5 = c0791jaM12462a.f22115a;
                                        if (str5 != null) {
                                            bundle.putString("origin", str5);
                                        }
                                        str6 = c0791jaM12462a.f22116b;
                                        if (str6 != null) {
                                            bundle.putString("name", str6);
                                        }
                                        obj = c0791jaM12462a.f22117c;
                                        if (obj != null) {
                                            qu5.m10126b(bundle, obj);
                                        }
                                        str7 = c0791jaM12462a.f22118d;
                                        if (str7 != null) {
                                            bundle.putString("trigger_event_name", str7);
                                        }
                                        bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                        str8 = c0791jaM12462a.f22120f;
                                        if (str8 != null) {
                                            bundle.putString("timed_out_event_name", str8);
                                        }
                                        bundle2 = c0791jaM12462a.f22121g;
                                        if (bundle2 != null) {
                                            bundle.putBundle("timed_out_event_params", bundle2);
                                        }
                                        str9 = c0791jaM12462a.f22122h;
                                        if (str9 != null) {
                                            bundle.putString("triggered_event_name", str9);
                                        }
                                        bundle3 = c0791jaM12462a.f22123i;
                                        if (bundle3 != null) {
                                            bundle.putBundle("triggered_event_params", bundle3);
                                        }
                                        bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                        str10 = c0791jaM12462a.f22125k;
                                        if (str10 != null) {
                                            bundle.putString("expired_event_name", str10);
                                        }
                                        bundle4 = c0791jaM12462a.f22126l;
                                        if (bundle4 != null) {
                                            bundle.putBundle("expired_event_params", bundle4);
                                        }
                                        bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                        bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                        bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                        appMeasurementSdk7.setConditionalUserProperty(bundle);
                                    }
                                } else {
                                    str2 = c0791jaM12462a.f22125k;
                                    if (str2 != null) {
                                        AppMeasurementSdk appMeasurementSdk8 = c0865la.f23885a;
                                        bundle = new Bundle();
                                        str5 = c0791jaM12462a.f22115a;
                                        if (str5 != null) {
                                            bundle.putString("origin", str5);
                                        }
                                        str6 = c0791jaM12462a.f22116b;
                                        if (str6 != null) {
                                            bundle.putString("name", str6);
                                        }
                                        obj = c0791jaM12462a.f22117c;
                                        if (obj != null) {
                                            qu5.m10126b(bundle, obj);
                                        }
                                        str7 = c0791jaM12462a.f22118d;
                                        if (str7 != null) {
                                            bundle.putString("trigger_event_name", str7);
                                        }
                                        bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                        str8 = c0791jaM12462a.f22120f;
                                        if (str8 != null) {
                                            bundle.putString("timed_out_event_name", str8);
                                        }
                                        bundle2 = c0791jaM12462a.f22121g;
                                        if (bundle2 != null) {
                                            bundle.putBundle("timed_out_event_params", bundle2);
                                        }
                                        str9 = c0791jaM12462a.f22122h;
                                        if (str9 != null) {
                                            bundle.putString("triggered_event_name", str9);
                                        }
                                        bundle3 = c0791jaM12462a.f22123i;
                                        if (bundle3 != null) {
                                            bundle.putBundle("triggered_event_params", bundle3);
                                        }
                                        bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                        str10 = c0791jaM12462a.f22125k;
                                        if (str10 != null) {
                                            bundle.putString("expired_event_name", str10);
                                        }
                                        bundle4 = c0791jaM12462a.f22126l;
                                        if (bundle4 != null) {
                                            bundle.putBundle("expired_event_params", bundle4);
                                        }
                                        bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                        bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                        bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                        appMeasurementSdk8.setConditionalUserProperty(bundle);
                                    } else {
                                        AppMeasurementSdk appMeasurementSdk9 = c0865la.f23885a;
                                        bundle = new Bundle();
                                        str5 = c0791jaM12462a.f22115a;
                                        if (str5 != null) {
                                            bundle.putString("origin", str5);
                                        }
                                        str6 = c0791jaM12462a.f22116b;
                                        if (str6 != null) {
                                            bundle.putString("name", str6);
                                        }
                                        obj = c0791jaM12462a.f22117c;
                                        if (obj != null) {
                                            qu5.m10126b(bundle, obj);
                                        }
                                        str7 = c0791jaM12462a.f22118d;
                                        if (str7 != null) {
                                            bundle.putString("trigger_event_name", str7);
                                        }
                                        bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                        str8 = c0791jaM12462a.f22120f;
                                        if (str8 != null) {
                                            bundle.putString("timed_out_event_name", str8);
                                        }
                                        bundle2 = c0791jaM12462a.f22121g;
                                        if (bundle2 != null) {
                                            bundle.putBundle("timed_out_event_params", bundle2);
                                        }
                                        str9 = c0791jaM12462a.f22122h;
                                        if (str9 != null) {
                                            bundle.putString("triggered_event_name", str9);
                                        }
                                        bundle3 = c0791jaM12462a.f22123i;
                                        if (bundle3 != null) {
                                            bundle.putBundle("triggered_event_params", bundle3);
                                        }
                                        bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                        str10 = c0791jaM12462a.f22125k;
                                        if (str10 != null) {
                                            bundle.putString("expired_event_name", str10);
                                        }
                                        bundle4 = c0791jaM12462a.f22126l;
                                        if (bundle4 != null) {
                                            bundle.putBundle("expired_event_params", bundle4);
                                        }
                                        bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                        bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                        bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                        appMeasurementSdk9.setConditionalUserProperty(bundle);
                                    }
                                }
                            } else if (str14.equals("fcm")) {
                                str2 = c0791jaM12462a.f22125k;
                                if (str2 != null) {
                                    AppMeasurementSdk appMeasurementSdk10 = c0865la.f23885a;
                                    bundle = new Bundle();
                                    str5 = c0791jaM12462a.f22115a;
                                    if (str5 != null) {
                                        bundle.putString("origin", str5);
                                    }
                                    str6 = c0791jaM12462a.f22116b;
                                    if (str6 != null) {
                                        bundle.putString("name", str6);
                                    }
                                    obj = c0791jaM12462a.f22117c;
                                    if (obj != null) {
                                        qu5.m10126b(bundle, obj);
                                    }
                                    str7 = c0791jaM12462a.f22118d;
                                    if (str7 != null) {
                                        bundle.putString("trigger_event_name", str7);
                                    }
                                    bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                    str8 = c0791jaM12462a.f22120f;
                                    if (str8 != null) {
                                        bundle.putString("timed_out_event_name", str8);
                                    }
                                    bundle2 = c0791jaM12462a.f22121g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    str9 = c0791jaM12462a.f22122h;
                                    if (str9 != null) {
                                        bundle.putString("triggered_event_name", str9);
                                    }
                                    bundle3 = c0791jaM12462a.f22123i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                    str10 = c0791jaM12462a.f22125k;
                                    if (str10 != null) {
                                        bundle.putString("expired_event_name", str10);
                                    }
                                    bundle4 = c0791jaM12462a.f22126l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                    bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                    bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                    appMeasurementSdk10.setConditionalUserProperty(bundle);
                                } else {
                                    AppMeasurementSdk appMeasurementSdk11 = c0865la.f23885a;
                                    bundle = new Bundle();
                                    str5 = c0791jaM12462a.f22115a;
                                    if (str5 != null) {
                                        bundle.putString("origin", str5);
                                    }
                                    str6 = c0791jaM12462a.f22116b;
                                    if (str6 != null) {
                                        bundle.putString("name", str6);
                                    }
                                    obj = c0791jaM12462a.f22117c;
                                    if (obj != null) {
                                        qu5.m10126b(bundle, obj);
                                    }
                                    str7 = c0791jaM12462a.f22118d;
                                    if (str7 != null) {
                                        bundle.putString("trigger_event_name", str7);
                                    }
                                    bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                    str8 = c0791jaM12462a.f22120f;
                                    if (str8 != null) {
                                        bundle.putString("timed_out_event_name", str8);
                                    }
                                    bundle2 = c0791jaM12462a.f22121g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    str9 = c0791jaM12462a.f22122h;
                                    if (str9 != null) {
                                        bundle.putString("triggered_event_name", str9);
                                    }
                                    bundle3 = c0791jaM12462a.f22123i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                    str10 = c0791jaM12462a.f22125k;
                                    if (str10 != null) {
                                        bundle.putString("expired_event_name", str10);
                                    }
                                    bundle4 = c0791jaM12462a.f22126l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                    bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                    bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                    appMeasurementSdk11.setConditionalUserProperty(bundle);
                                }
                            } else {
                                str2 = c0791jaM12462a.f22125k;
                                if (str2 != null) {
                                    AppMeasurementSdk appMeasurementSdk12 = c0865la.f23885a;
                                    bundle = new Bundle();
                                    str5 = c0791jaM12462a.f22115a;
                                    if (str5 != null) {
                                        bundle.putString("origin", str5);
                                    }
                                    str6 = c0791jaM12462a.f22116b;
                                    if (str6 != null) {
                                        bundle.putString("name", str6);
                                    }
                                    obj = c0791jaM12462a.f22117c;
                                    if (obj != null) {
                                        qu5.m10126b(bundle, obj);
                                    }
                                    str7 = c0791jaM12462a.f22118d;
                                    if (str7 != null) {
                                        bundle.putString("trigger_event_name", str7);
                                    }
                                    bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                    str8 = c0791jaM12462a.f22120f;
                                    if (str8 != null) {
                                        bundle.putString("timed_out_event_name", str8);
                                    }
                                    bundle2 = c0791jaM12462a.f22121g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    str9 = c0791jaM12462a.f22122h;
                                    if (str9 != null) {
                                        bundle.putString("triggered_event_name", str9);
                                    }
                                    bundle3 = c0791jaM12462a.f22123i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                    str10 = c0791jaM12462a.f22125k;
                                    if (str10 != null) {
                                        bundle.putString("expired_event_name", str10);
                                    }
                                    bundle4 = c0791jaM12462a.f22126l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                    bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                    bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                    appMeasurementSdk12.setConditionalUserProperty(bundle);
                                } else {
                                    AppMeasurementSdk appMeasurementSdk13 = c0865la.f23885a;
                                    bundle = new Bundle();
                                    str5 = c0791jaM12462a.f22115a;
                                    if (str5 != null) {
                                        bundle.putString("origin", str5);
                                    }
                                    str6 = c0791jaM12462a.f22116b;
                                    if (str6 != null) {
                                        bundle.putString("name", str6);
                                    }
                                    obj = c0791jaM12462a.f22117c;
                                    if (obj != null) {
                                        qu5.m10126b(bundle, obj);
                                    }
                                    str7 = c0791jaM12462a.f22118d;
                                    if (str7 != null) {
                                        bundle.putString("trigger_event_name", str7);
                                    }
                                    bundle.putLong("trigger_timeout", c0791jaM12462a.f22119e);
                                    str8 = c0791jaM12462a.f22120f;
                                    if (str8 != null) {
                                        bundle.putString("timed_out_event_name", str8);
                                    }
                                    bundle2 = c0791jaM12462a.f22121g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    str9 = c0791jaM12462a.f22122h;
                                    if (str9 != null) {
                                        bundle.putString("triggered_event_name", str9);
                                    }
                                    bundle3 = c0791jaM12462a.f22123i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", c0791jaM12462a.f22124j);
                                    str10 = c0791jaM12462a.f22125k;
                                    if (str10 != null) {
                                        bundle.putString("expired_event_name", str10);
                                    }
                                    bundle4 = c0791jaM12462a.f22126l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", c0791jaM12462a.f22127m);
                                    bundle.putBoolean("active", c0791jaM12462a.f22128n);
                                    bundle.putLong("triggered_timestamp", c0791jaM12462a.f22129o);
                                    appMeasurementSdk13.setConditionalUserProperty(bundle);
                                }
                            }
                        }
                    }
                    arrayDeque.offer(c0791jaM12462a);
                    i7 = i8;
                }
                return;
            }
            Object obj8 = arrayList.get(i);
            i++;
            Map map = (Map) obj8;
            String[] strArr2 = C1316x2.f33932g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = C1316x2.f33932g;
            for (int i11 = 0; i11 < 5; i11++) {
                String str15 = strArr3[i11];
                if (!map.containsKey(str15)) {
                    arrayList6.add(str15);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new C1278w2(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new C1316x2((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", C1316x2.f33933h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new C1278w2("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new C1278w2("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}
