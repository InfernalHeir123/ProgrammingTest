import java.util.*;

public class PatientGroup {
    List<Patient> patGroup = new ArrayList<Patient>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Patient> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Patient patient) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Patient> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Patient> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Patient get(int index) {
            return null;
        }

        @Override
        public Patient set(int index, Patient element) {
            return null;
        }

        @Override
        public void add(int index, Patient element) {

        }

        @Override
        public Patient remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Patient> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Patient> listIterator(int index) {
            return null;
        }

        @Override
        public List<Patient> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public PatientGroup(List<Patient> patGroup){
        this.patGroup = patGroup;
    }

    // Admin Display Shows the display of different patiends for Admin
    public void AdminDisplay(){
        for(int i = 0; i < patGroup.size(); i++){
            System.out.println("Patient: " + patGroup.get(i).getPatName() + " MRI: " +
                    String.valueOf(patGroup.get(i).getPatMRI().getMagStrength()) + " Tesla, " +
                    patGroup.get(i).getPatMRI().getDateExam().toString() + " BP: " +
                    patGroup.get(i).getPatBP().getVST() + ", " +
                    patGroup.get(i).getPatBP().getDateExam().toString()
            );

        }
    }
}
